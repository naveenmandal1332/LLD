public class SelectOperationState extends AtmStates {

  public SelectOperationState() {
    System.out.println("Please Select Operation!");
    showOperations();
  }

  @Override
  public void selectOperation(ATM atm, Card card, TransactionType transactionType) {

    switch (transactionType) {
      case CASH_WITHDRAWAL:
        atm.setAtmStates(new CashWithdrawalState());
        break;
      case BALANCE_CHECK:
        atm.setAtmStates(new BalanceCheckState());
        break;
      default:
        break;
    }
  }

  @Override
  public void exit(ATM atm) {
    returnCard();
    atm.setAtmStates(new IdleState());
    System.out.println("Exit Successfully from Select Operation State!");
  }

  @Override
  public void returnCard() {
    System.out.println("Your card is returned!");
  }

  public void showOperations() {
    TransactionType.showAllTransaction();
  }
}