import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] wordBank = {
      "ant",
      "baboon",
      "badger",
      "bat",
      "bear",
      "beaver",
      "camel",
      "cat",
      "clam",
      "cobra",
      "cougar",
      "coyote",
      "crow",
      "deer",
      "dog",
      "donkey",
      "duck",
      "eagle",
      "ferret",
      "fox",
      "frog",
      "goat",
      "goose",
      "hawk",
      "lion",
      "lizard",
      "llama",
      "mole",
      "monkey",
      "moose",
      "mouse",
      "mule",
      "newt",
      "otter",
      "owl",
      "panda",
      "parrot",
      "pigeon",
      "python",
      "rabbit",
      "ram",
      "rat",
      "raven",
      "rhino",
      "salmon",
      "seal",
      "shark",
      "sheep",
      "skunk",
      "sloth",
      "snake",
      "spider",
      "stork",
      "swan",
      "tiger",
      "toad",
      "trout",
      "turkey",
      "turtle",
      "weasel",
      "whale",
      "wolf",
      "wombat",
      "zebra",
    };
    //generate word
    //generate board
    //user input has to equal board length

    String randomWordGenerated = randomWord(wordBank);
    System.out.println(randomWordGenerated);
    generateBoard(randomWordGenerated);
    System.out.println(Arrays.toString(wordToArray(randomWordGenerated)));

    System.out.println("GUESS");
    String userInput = scanner.nextLine();
    System.out.println(
      inputLength(userInput, wordToArray(randomWordGenerated))
    );
  }

  public static String randomWord(String[] wordBank) {
    return wordBank[(int) (Math.random() * (wordBank.length + 1))];
  }

  public static void generateBoard(String word) {
    for (int i = 0; i < word.length(); i++) {
      System.out.print("_ ");
    }
  }

  public static char[] wordToArray(String wordToArray) {
    char[] letterArray = new char[wordToArray.length()];
    for (int i = 0; i < wordToArray.length(); i++) {
      letterArray[i] = wordToArray.charAt(i);
    }
    return letterArray;
  }

  public static boolean inputLength(String userInput, char[] characterArray) {
    char[] translate = wordToArray(userInput);
    return (translate.length == characterArray.length);
  }
}
