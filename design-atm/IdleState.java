public class IdleState extends AtmStates {

  @Override
  public void insertCard(ATM atm, Card card) {
    System.out.println("ATM Card Inserted!");

    // Change State:
    atm.setAtmStates(new HasCardState());
  }
}