public class Main {

  public static void main(String[] args) {
    Book[] books = {
      new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99),
      new Book("1984", "George Orwell", 4.17, 12.99),
      new Book("Moby-Dick", "Herman Melville", 3.5, 14.99),
      new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99),
    };

    Book newBook = new Book(books[0]);
    Store bookStore = new Store();

    for (int i = 0; i < books.length; i++) {
      bookStore.addBook(books[i]);
    }
    bookStore.setBook(newBook, 1);

    System.out.println(bookStore.getBook(1));
    System.out.println(bookStore.getBook(1).getTitle());
    System.out.println(bookStore.contains(newBook)); // should be
    bookStore.sellBook("To Kill a Mockingbird");
    bookStore.sellBook("To Kill a Mockingbird");
    System.out.println(bookStore.contains(newBook));
  }
}
