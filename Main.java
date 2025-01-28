public class Main {

  public static void main(String[] args) {
    Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
    Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
    Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
    Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);
    Book book5 = new Book(book1);
    Book book6 = new Book(book2);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(book4);
    System.out.println(book5);
    System.out.println(book6);
  }
}
