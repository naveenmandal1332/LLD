public class ATMRoom {

  public static void main(String args[]) {

    ATM atm = new ATM();

    // Intialiaze ATM:
    intializeATM(atm, 50, 30, 20);

    atm.printCurrentATMStatus();
  }

  public static void intializeATM(ATM atm, int noOfTwoThousandNotes, int noOfFiveHundredNotes,
      int noOfOneHundredNotes) {

    double atmBalance = (2000 * noOfTwoThousandNotes) + (500 * noOfFiveHundredNotes) + (100 * noOfOneHundredNotes);

    atm.setNoOfTwoThousandNotes(noOfTwoThousandNotes);
    atm.setNoOfFiveHundredNotes(noOfFiveHundredNotes);
    atm.setNoOfOneHundredNotes(noOfOneHundredNotes);
    atm.setBalance(atmBalance);

  }
}