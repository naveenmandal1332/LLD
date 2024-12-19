public class HasCardState extends AtmStates {

  public HasCardState() {
    System.out.println("Enter Your PIN Number!");
  }

  @Override
  public void authenticatePin(ATM atm, Card card, int pin) {

    System.out.println("PIN Verifications Start!");
    if (card.getCardPin() == pin) {
      System.out.println("PIN Verified Successfully!");

      // Change State:
      atm.setAtmStates(new SelectOperationState());
    } else {
      System.out.println("Wrong PIN NUMBER!");

      // Change State:
      exit(atm);
    }
  }

  @Override
  public void exit(ATM atm) {
    returnCard();

    // Change State:
    atm.setAtmStates(new IdleState());

    System.out.println("ATM State has been change to Idle!");
  }

  @Override
  public void returnCard() {
    System.out.println("ATM Card Return Successfully!");
  }
}