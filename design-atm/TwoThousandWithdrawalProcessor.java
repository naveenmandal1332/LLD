public class TwoThousandWithdrawalProcessor extends CashWithdrawalProcessor {

  TwoThousandWithdrawalProcessor(CashWithdrawalProcessor nexWithdrawalProcessor) {
    super(nexWithdrawalProcessor);
  }

  public void withdraw(ATM atm, int remainingAmount) {
    int required = atm.getNoOfTwoThousandNotes();
    int available = remainingAmount / 2000;
    int remBalance = remainingAmount % 2000;

    if (required <= available) {
      atm.deductTwoThousandNotes(required);
      return;
    }

    if (required > available) {
      atm.deductTwoThousandNotes(available);
      remBalance += (required - available) * 2000;
    }

    // IF Balance is remaining then then call another processor:
    if (remBalance != 0) {
      super.withdraw(atm, remBalance);
    }
  }
}