import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  }

  public static boolean isNullOrBlank(String input) {
    return (input == null) | input.isBlank();
  }

  public static boolean incorrectIssueNumber(int issueNumber) {
    return issueNumber <= 0;
  }

  public static boolean incorrectPublicationYear(int publicationYear) {
    return publicationYear <= 0;
  }

  public static String promptForTitle(Scanner scanner) {
    while (true) {
      //prompt the user to enter a title
      System.out.println("Please enter a valid title: ");
      // assign the response to the title
      String title = scanner.nextLine();

      //check to see if the title is null or blank using the method we made, if it's not null or blank, return the string breaking the while loop
      if (!isNullOrBlank(title)) {
        return title;
      }
    }
  }

  public static String promptForPublisher(Scanner scanner) {
    while (true) {
      System.out.println("Please enter a valid publisher: ");
      String publisher = scanner.nextLine();

      if (!isNullOrBlank(publisher)) {
        return publisher;
      }
    }
  }

  public static int promptForIssueNumber(Scanner scanner) {
    while (true) {
      System.out.println("Please enter a valid issue number (greater than 0)");
      if (!scanner.hasNextInt()) {
        //clear the input
        scanner.next();
        continue;
      }

      int issueNumber = scanner.nextInt();

      if (!incorrectIssueNumber(issueNumber)) {
        return issueNumber;
      }
    }
  }

  public static int promptForPublicationYear(Scanner scanner) {
    while (true) {
      System.out.println(
        "Please enter a valid publication year (greater than 0)"
      );
      //if the next input isn't an int, clear the input and reset the loop
      if (!scanner.hasNextInt()) {
        scanner.next();
        continue;
      }

      int publicationYear = scanner.nextInt();

      if (!incorrectPublicationYear(publicationYear)) {
        return publicationYear;
      }
    }
  }
}
