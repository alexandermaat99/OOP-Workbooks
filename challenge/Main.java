import java.util.Scanner;

public class Main {

  static Store store = new Store();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Movie[] movies = new Movie[] {
      new Movie("The Shawshank Redemption", "BlueRay", 9.2),
      new Movie("The Godfather", "BlueRay", 9.1),
      new Movie("The Godfather: Part II", "DVD", 9.0),
      new Movie("12 Angry Men", "DVD", 8.9),
      new Movie("The Dark Knight", "BlueRay", 9.0),
      new Movie("Schindler's List", "DVD", 8.9),
      new Movie(
        "The Lord of the Rings: The Return of the King",
        "BlueRay",
        8.9
      ),
      new Movie("Pulp Fiction", "DVD", 8.8),
      new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
      new Movie(
        "The Lord of the Rings: The Fellowship of the Ring",
        "DVD",
        8.8
      ),
    };

    for (int i = 0; i < movies.length; i++) {
      store.setMovie(i, movies[i]);
    }

    printStore();
    userInput();
    // System.out.println("\n Please chose an integer between 0 - 9");
    // int movieToChangeIndex = scan.nextInt();
    // Movie movieToChange = store.getMovie(movieToChangeIndex);
    // System.out.println(movieToChange);

    // System.out.println(
    //   "Set a new rating for " + movieToChange.getName() + ": "
    // );
    // movieToChange.setRating(scan.nextDouble());
    // store.setMovie(movieToChangeIndex, movieToChange);
    // printStore();
  }

  public static void userInput() {
    Scanner scanner = new Scanner(System.in);
    String status = "continue";
    while (status.equals("continue")) {
      //ask the user what movie they want to change, by index
      System.out.println("Select a number by index (0 - 9): ");
      int indexToRate = scanner.nextInt();

      //take that index and return information about the movie
      Movie movieToEdit = store.getMovie(indexToRate);
      System.out.println(
        "Please enter the new rating for " +
        movieToEdit.getName() +
        " which currently has a rating of " +
        movieToEdit.getRating()
      );

      //get the new rating and update the movie
      double newRating = scanner.nextDouble();
      movieToEdit.setRating(newRating);
      store.setMovie(indexToRate, movieToEdit);

      printStore();

      System.out.print("To edit another rating, type: 'continue': ");
      status = scanner.next();
    }
    scanner.close();
  }

  public static void printStore() {
    System.out.println(
      "********************************MOVIE STORE*******************************"
    );
    System.out.println(store);
  }
}
