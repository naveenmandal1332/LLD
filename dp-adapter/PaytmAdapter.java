// This is the new requirement [Adapter]

public class PaytmAdapter implements PaymentProcessor {

  private PaymentGateway paytm;

  public PaytmAdapter(PaymentGateway paytm) {
    this.paytm = paytm;
  }

  @Override
  public void pay(int amount) {
    paytm.makePayment(amount);
  }
}