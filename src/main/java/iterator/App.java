package iterator;

public class App {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("書籍A"));
    bookShelf.appendBook(new Book("書籍B"));
    bookShelf.appendBook(new Book("書籍C"));
    bookShelf.appendBook(new Book("書籍D"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
