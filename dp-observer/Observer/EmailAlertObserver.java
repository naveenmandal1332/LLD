package Observer;

import Obserable.StockObserable;

public class EmailAlertObserver implements NotificationAlertObserver {

  String emailId;
  StockObserable obserable;

  public EmailAlertObserver(String emailId, StockObserable obserable) {
    this.emailId = emailId;
    this.obserable = obserable;
  }

  private void sendEmail(String emailId, String message) {
    System.out.println("Email Sent by " + emailId + " " + "And Message: " + message);
  }

  @Override
  public void update() {
    String message = "Item is in Stock, Hurry up!";
    sendEmail(emailId, message);
  }
}