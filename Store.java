import java.util.ArrayList;

public class Store {

  private ArrayList<Book> books;

  //init an array list of type book and calling it books
  public Store() {
    this.books = new ArrayList<Book>();
  }

  public Book getBook(int index) {
    return new Book(this.books.get(index));
  }

  public void setBook(Book newBook, int atIndex) {
    this.books.set(atIndex, new Book(newBook));
  }

  public void addBook(Book bookToAdd) {
    this.books.add(new Book(bookToAdd));
  }

  //possible to name contains even though it's a default function since the signature is different
  public boolean contains(Book bookToCheck) {
    return this.books.contains(bookToCheck);
  }

  public void sellBook(String title) {
    for (int i = 0; i < this.books.size(); i++) {
      if (this.books.get(i).getTitle().equals(title)) {
        this.books.remove(i);
      }
    }
  }
}
