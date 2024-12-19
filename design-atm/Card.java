import java.time.LocalDate;

public class Card {
  String cardHolderName;
  String cardNumber;
  String bankName;
  int cvv;
  LocalDate expiryDate;
  int cardPin;
  double balance;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getCardPin() {
    return cardPin;
  }

  public void setCardPin(int cardPin) {
    this.cardPin = cardPin;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public int getCvv() {
    return cvv;
  }

  public void setCvv(int cvv) {
    this.cvv = cvv;
  }

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public void deductBankBalance(double amount) {
    balance -= amount;
    System.out.println("Amount is debited successfully!");
  }
}
