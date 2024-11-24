import java.util.Date;

public class PaymentDetails {

  int paymentId;
  double amountPaid;
  Date dateOfPayment;
  boolean isRefundable;
  PaymentMode paymentmode;

  public PaymentDetails(int paymentId, double amountPaid, Date dateOfPayment, PaymentMode paymentmode) {
    this.paymentId = paymentId;
    this.amountPaid = amountPaid;
    this.dateOfPayment = dateOfPayment;
    this.isRefundable = false;
    this.paymentmode = paymentmode;
  }
}