package Observer;

import Obserable.StockObserable;

public class MobileAlertObserver implements NotificationAlertObserver {

  String mobileNumber;
  StockObserable obserable;

  public MobileAlertObserver(String mobileNumber, StockObserable obserable) {
    this.mobileNumber = mobileNumber;
    this.obserable = obserable;
  }

  private void sendSms(String mobileNumber, String message) {
    System.out.println("SMS Sent by " + mobileNumber + " " + "And Message: " + message);
  }

  @Override
  public void update() {
    sendSms(mobileNumber, "Item is in stock, Hurry up!");
  }

}