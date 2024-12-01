package Transaction;

import java.util.List;

public class TransactionController {
  TransactionService transactionService;

  public TransactionController() {
    this.transactionService = new TransactionService();
  }

  public void makePayment(TransactionDTO transactionDTO) {
    transactionService.makeTransaction(transactionDTO);
  }

  public List<Transaction> getTransactionHistory(int userId) {
    return transactionService.geTransactionsHistory(userId);
  }
}