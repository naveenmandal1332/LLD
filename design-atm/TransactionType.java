
public enum TransactionType {
  CASH_WITHDRAWAL,
  BALANCE_CHECK;

  public static void showAllTransaction() {
    for (TransactionType txn : TransactionType.values()) {
      System.out.println(txn.name());
    }
  }
}
