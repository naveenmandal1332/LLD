public class NetBankingPayment implements PaymentGateway {

  @Override
  public void pay(double amount) {
    System.out.println("Payment of Rs " + amount + " Send Successfully by Net Banking!");
  }
}