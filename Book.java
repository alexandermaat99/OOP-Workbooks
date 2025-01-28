import java.util.Objects;

public class Book {

  private String title;
  private String author;
  private double rating;
  private double price;

  public Book(String title, String author, double rating, double price) {
    this.title = title;
    this.author = author;
    this.rating = rating;
    this.price = price;
  }

  //copy constructor
  public Book(Book source) {
    this.title = source.title;
    this.author = source.author;
    this.rating = source.rating;
    this.price = source.price;
  }

  //getter and setter methods
  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getRating() {
    return this.rating;
  }

  public double getPrice() {
    return this.price;
  }

  //setters
  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  public void setAuthor(String newAuthor) {
    this.author = newAuthor;
  }

  public void setRating(double newRating) {
    this.rating = newRating;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  //toString methods
  public String toString() {
    return (
      "\nTitle: " +
      this.title +
      "\nAuthor: " +
      author +
      "\nRating: " +
      rating +
      "\nPrice:" +
      price
    );
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Book)) {
      return false;
    }
    Book book = (Book) o;
    return (
      Objects.equals(title, book.title) &&
      Objects.equals(author, book.author) &&
      rating == book.rating &&
      price == book.price
    );
  }

  public int hashCode() {
    return Objects.hash(title, author, rating, price);
  }
}
