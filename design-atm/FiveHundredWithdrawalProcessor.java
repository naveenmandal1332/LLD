public class FiveHundredWithdrawalProcessor extends CashWithdrawalProcessor {

  FiveHundredWithdrawalProcessor(CashWithdrawalProcessor nexWithdrawalProcessor) {
    super(nexWithdrawalProcessor);
  }

  public void withdraw(ATM atm, int remainingAmount) {
    int required = remainingAmount / 500;
    int available = atm.getNoOfFiveHundredNotes();
    int remBalance = remainingAmount % 500;

    if (required <= available) {
      atm.deductFiveHundredNotes(required);
      return;
    }

    if (required > available) {
      atm.deductFiveHundredNotes(available);
      remBalance += (required - available) * 500;
      return;
    }

    // IF Balance is remaining then then call another processor:
    if (remBalance != 0) {
      super.withdraw(atm, remainingAmount);
    }
  }
}