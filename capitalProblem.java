//Write a function that returns true if the first letter of a string is Capitalized

public class capitalProblem {

  public static void main(String[] args) {
    System.out.println(isCapital("Fred") == true);
    System.out.println(isCapital("fred") == false);
    System.out.println(isCapital("") == false);
    System.out.println(isCapital("2") == false);
    System.out.println(isCapital("a") == false);
    System.out.println(isCapital(null) == false);
  }

  public static boolean isCapital(String wordToCheck) {
    if (wordToCheck == null || wordToCheck.isBlank()) {
      return false;
    }

    char firstLetter = wordToCheck.charAt(0);

    return ((firstLetter >= 'A') & (firstLetter <= 'Z')) ? true : false;
  }
}
