import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Payment {
  List<PaymentDetails> payments = new ArrayList<>();

  public void makePayment(int paymentId, double amount, PaymentMode paymentMode) {
    Date todayDate = new Date();
    PaymentDetails payment = new PaymentDetails(paymentId, amount, todayDate, paymentMode);

    System.out.println(
        "Payment Successfully with payment id: " + paymentId + " Payment Type: " + paymentMode + " Amount: " + amount);
    payments.add(payment);
  }

  public List<PaymentDetails> getPaymentDetails() {
    return payments;
  }

}