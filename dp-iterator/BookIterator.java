import java.util.List;

public class BookIterator implements Iterator {

  private List<Book> bookList;
  int index = 0;

  public BookIterator(List<Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public boolean hasNext() {
    return index < bookList.size();
  }

  @Override
  public Object next() {
    while (hasNext()) {
      return bookList.get(index++);
    }

    return null;
  }
}