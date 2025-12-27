
public class PaymentGatewayFactory {

  public static PaymentGateway getPaymentGateway(PaymentType paymentType) {
    switch (paymentType) {
      case CARD:
        return new CardPayment();
      case UPI:
        return new UPIpayment();
      case NETBANKING:
        return new NetBankingPayment();
      default:
        throw new IllegalArgumentException("Invalid payment type");
    }

  }
}