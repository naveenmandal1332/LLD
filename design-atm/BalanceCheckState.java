public class BalanceCheckState extends AtmStates {

  @Override
  public void displayBalance(ATM atm, Card card) {
    System.out.println("Your Current Balance is " + card.getBalance());
    exit(atm);
  }

  @Override
  public void exit(ATM atm) {
    returnCard();
    atm.setAtmStates(new IdleState());
    System.out.println("Exit Successfully from Check Balance State!");
  }

  @Override
  public void returnCard() {
    System.out.println("Your card is returned!");
  }
}