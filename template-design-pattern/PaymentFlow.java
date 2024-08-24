public abstract class PaymentFlow {

  public abstract boolean validateRequest();

  public abstract int calculateFees();

  public abstract void debitAmount();

  public abstract void creditAmount();

  // This is template:
  public final void sendMoney() {

    validateRequest();

    calculateFees();

    debitAmount();

    creditAmount();
  }
}