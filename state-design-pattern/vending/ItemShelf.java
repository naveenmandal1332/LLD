package vending;

public class ItemShelf {
  Item item;
  int code;
  boolean soldOut;

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public boolean getSoldOut() {
    return soldOut;
  }

  public void setSoldOut(boolean soldOut) {
    this.soldOut = soldOut;
  }
}