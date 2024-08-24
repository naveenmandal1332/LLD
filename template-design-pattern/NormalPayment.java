public class NormalPayment extends PaymentFlow {

  private int amount;

  NormalPayment(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean validateRequest() {
    System.out.println("Request Validated successfully!");
    return true;
  }

  @Override
  public int calculateFees() {
    int fee = (amount * 2) / 100;
    return fee;
  }

  @Override
  public void debitAmount() {
    System.out.println("Amount debited: " + amount);
  }

  @Override
  public void creditAmount() {
    int fee = calculateFees();
    System.out.println("Transaction cost: " + fee);
    System.out.println("Amount credited: " + (amount - fee));
  }
}