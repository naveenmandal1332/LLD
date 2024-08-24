public class Client {

  public static void main(String[] args) {

    MerchentPayment merchentPayment = new MerchentPayment(100);
    merchentPayment.sendMoney();

    NormalPayment normalPayment = new NormalPayment(1000);
    normalPayment.sendMoney();
  }
}