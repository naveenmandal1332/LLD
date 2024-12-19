public class CashWithdrawalState extends AtmStates {

  public CashWithdrawalState() {
    System.out.println("Please enter the Withdrawal Amount");
  }

  @Override
  public void withdrawCash(ATM atm, Card card, double amount) {
    if (atm.getBalance() < amount) {
      System.out.println("ATM has insufficient balance!");
      return;
    }

    if (card.getBalance() < amount) {
      System.out.println("Insufficient balance in your account!");
      return;
    }

    // Deduct amount from account:
    card.deductBankBalance(amount);

    // Deduct amount from ATM:
    atm.deductAtmBalance(amount);

    // Applay chain of responsibility to adjust 2K, 500, 100 Notes:
    CashWithdrawalProcessor cashWithdrawalProcessor = new TwoThousandWithdrawalProcessor(
        new FiveHundredWithdrawalProcessor(new OneHundredWithdrawalProcessor(null)));

    cashWithdrawalProcessor.withdraw(atm, amount);
    exit(atm);
  }

  @Override
  public void exit(ATM atm) {
    returnCard();
    atm.setAtmStates(new IdleState());
    System.out.println("Exit Successfully from Cash Withdrawal State!");
  }

  @Override
  public void returnCard() {
    System.out.println("Your card is returned!");
  }
}