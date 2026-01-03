public class Client {

  public static void main(String[] args) {

    PaymentProcessor paymentProcessor = new PaytmAdapter(new PaymentGateway());
    paymentProcessor.pay(1000);
  }
}