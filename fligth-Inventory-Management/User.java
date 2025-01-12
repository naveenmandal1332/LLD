public class User {

  String userId;
  String userName;
  double funds;

  public User(String userId, String userName, double funds) {
    this.userId = userId;
    this.userName = userName;
    this.funds = funds;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public double getFunds() {
    return funds;
  }

  public void deductMoney(double price) {
    if (price > funds)
      throw new IllegalStateException("Insufficient funds!");
    funds -= price;
  }
}