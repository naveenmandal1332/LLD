package Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import Instrument.Instrument;
import Instrument.InstrumentController;

public class TransactionService {
  InstrumentController instrumentController;
  Map<Integer, List<Transaction>> userVsTransction;

  public TransactionService() {
    this.instrumentController = new InstrumentController();
    userVsTransction = new HashMap<>();
  }

  public void makeTransaction(TransactionDTO transactionDTO) {

    Instrument senderInstrument = instrumentController.getInstrumentById(transactionDTO.getSenderId(),
        transactionDTO.getDebitInstrumentId());

    Instrument receiverInstrument = instrumentController.getInstrumentById(transactionDTO.getReceverId(),
        transactionDTO.getCreditInstrumentId());

    // Process will verify the sender and reciver instruments:

    Transaction txn = new Transaction();
    txn.setTransactionId(new Random().nextInt(100 - 10) + 10);
    txn.setTransactionStatus(TransactionStatus.SUCCESS);
    txn.setAmount(transactionDTO.getAmount());
    txn.setSenderId(transactionDTO.getSenderId());
    txn.setSenderId(transactionDTO.getReceverId());
    txn.setCreditInstrumentId(transactionDTO.getCreditInstrumentId());
    txn.setCreditInstrumentId(transactionDTO.getDebitInstrumentId());

    // Fetch Previous Transaction:
    List<Transaction> senderTxns = userVsTransction.get(transactionDTO.getSenderId());
    List<Transaction> receiverTxns = userVsTransction.get(transactionDTO.getReceverId());

    if (senderTxns == null)
      senderTxns = new ArrayList<>();
    if (receiverTxns == null)
      receiverTxns = new ArrayList<>();

    senderTxns.add(txn);
    receiverTxns.add(txn);

    userVsTransction.put(transactionDTO.getSenderId(), receiverTxns);
    userVsTransction.put(transactionDTO.getReceverId(), receiverTxns);

    System.out.println("Transaction completed successfully! with SenderId: " + transactionDTO.getSenderId()
        + " ReceiverId: " + transactionDTO.getSenderId() + " Amount: " + transactionDTO.getAmount());
  }

  public List<Transaction> geTransactionsHistory(int userId) {
    return userVsTransction.get(userId);
  }
}