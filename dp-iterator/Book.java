/**
 * Book
 */

public class Book {

  int price;
  String name;

  Book(int price, String name) {
    this.price = price;
    this.name = name;
  }

  public int getBookPrice() {
    return price;
  }

  public String getBookName() {
    return name;
  }
}