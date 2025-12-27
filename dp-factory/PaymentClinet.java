public class PaymentClinet {
  public static void main(String[] args) {

    PaymentGateway gateway = PaymentGatewayFactory.getPaymentGateway(PaymentType.UPI);
    gateway.pay(100000);
  }

}