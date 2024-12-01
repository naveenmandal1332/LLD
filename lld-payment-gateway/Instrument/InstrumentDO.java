package Instrument;

public class InstrumentDO {
  String accountNumber;
  String ifscCode;
  String cardNumber;
  String cvvNumber;
  int userId;
  InstrumentType instrumentType;

  public InstrumentType getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentType instrumentType) {
    this.instrumentType = instrumentType;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getIfscCode() {
    return ifscCode;
  }

  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCvvNumber() {
    return cvvNumber;
  }

  public void setCvvNumber(String cvvNumber) {
    this.cvvNumber = cvvNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
}