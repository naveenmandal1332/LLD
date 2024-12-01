package Transaction;

public class TransactionDTO {
  int senderId;
  int receverId;
  int creditInstrumentId;
  int debitInstrumentId;
  int amount;

  public int getSenderId() {
    return senderId;
  }

  public int getReceverId() {
    return receverId;
  }

  public int getCreditInstrumentId() {
    return creditInstrumentId;
  }

  public int getDebitInstrumentId() {
    return debitInstrumentId;
  }

  public int getAmount() {
    return amount;
  }

  public TransactionDTO(int senderId,
      int receverId,
      int creditInstrumentId,
      int debitInstrumentId,
      int amount) {
    this.senderId = senderId;
    this.receverId = receverId;
    this.creditInstrumentId = creditInstrumentId;
    this.debitInstrumentId = debitInstrumentId;
    this.amount = amount;
  }
}