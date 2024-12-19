public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor {

  OneHundredWithdrawalProcessor(CashWithdrawalProcessor nexWithdrawalProcessor) {
    super(nexWithdrawalProcessor);
  }

  public void withdraw(ATM atm, int remainingAmount) {
    int required = remainingAmount / 100;
    int available = atm.getNoOfOneHundredNotes();
    int remBalance = remainingAmount % 100;

    if (required <= available) {
      atm.deductFiveHundredNotes(required);
      return;
    }

    if (required > available) {
      atm.deductFiveHundredNotes(available);
      remBalance += (required - available) * 100;
      return;
    }

    // IF Balance is remaining then then call another processor:
    if (remBalance != 0) {
      System.out.println("Something went wrong");
    }
  }

}