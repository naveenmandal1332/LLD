public class ATM {

  // private static ATM atmObject = new ATM();

  AtmStates currenAtmStates;

  private double balance;
  int noOfTwoThousandNotes;
  int noOfFiveHundredNotes;
  int noOfOneHundredNotes;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getNoOfTwoThousandNotes() {
    return noOfTwoThousandNotes;
  }

  public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
    this.noOfTwoThousandNotes = noOfTwoThousandNotes;
  }

  public int getNoOfFiveHundredNotes() {
    return noOfFiveHundredNotes;
  }

  public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
    this.noOfFiveHundredNotes = noOfFiveHundredNotes;
  }

  public int getNoOfOneHundredNotes() {
    return noOfOneHundredNotes;
  }

  public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
    this.noOfOneHundredNotes = noOfOneHundredNotes;
  }

  public void setAtmStates(AtmStates currenAtmStates) {
    this.currenAtmStates = currenAtmStates;
  }

  public AtmStates getAtmStates() {
    return currenAtmStates;
  }

  public void deductAtmBalance(double amount) {
    balance -= amount;
  }

  public void deductTwoThousandNotes(int number) {
    noOfTwoThousandNotes -= number;
  }

  public void deductFiveHundredNotes(int number) {
    noOfFiveHundredNotes -= number;
  }

  public void deductOneHundredNotes(int number) {
    noOfOneHundredNotes -= number;
  }

  public void printCurrentATMStatus() {
    System.out.println("Balance: " + balance);
    System.out.println("2kNotes: " + noOfTwoThousandNotes);
    System.out.println("500Notes: " + noOfFiveHundredNotes);
    System.out.println("100Notes: " + noOfOneHundredNotes);

  }

}
