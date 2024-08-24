import java.util.List;
import java.util.Arrays;

public class Client {

  public static void main(String[] args) {
    List<Book> bookList = Arrays.asList(
        new Book(100, "Clean Code"),
        new Book(200, "Head First Design"),
        new Book(300, "Data Intensive application"),
        new Book(300, "System Design"));

    Library library = new Library(bookList);
    Iterator iterator = library.createIterator();

    while (iterator.hasNext()) {
      Book book = (Book) iterator.next();
      System.out.println("Book Name: " + book.getBookName() + " : " + "Book Price: " + book.getBookPrice());
    }

  }
}