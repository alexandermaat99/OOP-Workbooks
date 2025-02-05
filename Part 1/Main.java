import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  static Store store = new Store();

  public static void main(String[] args) {
    try {
      loadMovies("Part 1/movies.txt");
      printStore();
      userInput();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void userInput() {
    Scanner scanner = new Scanner(System.in);
    String status = "continue";

    while (status.equals("continue")) {
      int choice = (promptForChoice(scanner));
      Movie movie = store.getMovie(choice);
      double rating = promptForRating(scanner, movie.getName());

      movie.setRating(rating);
      store.setMovie(choice, movie);
      printStore();
      System.out.print("To edit another rating, type: 'continue': ");
      status = scanner.next();
    }
    scanner.close();
  }

  public static int promptForChoice(Scanner scanner) {
    while (true) {
      System.out.print("\nPlease choose an integer between 0 - 9: ");

      //scan to see if it is NOT an Int
      if (!scanner.hasNextInt()) {
        // if it is NOT an int, it consumes whatever the response is
        scanner.next();
        //continue restarts the loop
        continue;
      }

      //if it passes the first check, it sets the choice to their response
      int choice = scanner.nextInt();
      //if the choice is incorrect, it starts the loop over again
      if (incorrectChoice(choice)) continue;
      //otherwise it returns their choice which has been checked for correctness
      else return choice;
    }
  }

  public static boolean incorrectChoice(int choice) {
    return (choice < 0) | (choice > 9);
  }

  public static double promptForRating(Scanner scanner, String name) {
    while (true) {
      System.out.print("\nSet a new rating for " + name + ": ");

      if (!scanner.hasNextDouble()) {
        scanner.next();
        continue;
      }

      double rating = scanner.nextDouble();
      if (incorrectRating(rating)) {
        continue;
      } else return rating;
    }
  }

  public static boolean incorrectRating(double rating) {
    return (rating < 0) | (rating > 10);
  }

  public static void loadMovies(String fileName) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream(fileName);
    Scanner scanFile = new Scanner(fis);

    while (scanFile.hasNextLine()) {
      // TODO
    }
    scanFile.close();
  }

  public static void printStore() {
    System.out.println(
      "********************************MOVIE STORE*******************************"
    );
    System.out.println(store);
  }
}
