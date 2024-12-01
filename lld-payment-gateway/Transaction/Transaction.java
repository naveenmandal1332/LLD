package Transaction;

public class Transaction {
  int transactionId;
  int senderId;
  int receiverId;
  int creditInstrumentId;
  int debitInstrumentId;
  int amount;
  TransactionStatus transactionStatus;

  public int getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(int transactionId) {
    this.transactionId = transactionId;
  }

  public int getSenderId() {
    return senderId;
  }

  public void setSenderId(int senderId) {
    this.senderId = senderId;
  }

  public int getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(int receiverId) {
    this.receiverId = receiverId;
  }

  public int getDebitInstrumentId() {
    return debitInstrumentId;
  }

  public void setDebitInstrumentId(int debitInstrumentId) {
    this.debitInstrumentId = debitInstrumentId;
  }

  public int getCreditInstrumentId() {
    return creditInstrumentId;
  }

  public void setCreditInstrumentId(int creditInstrumentId) {
    this.creditInstrumentId = creditInstrumentId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

}