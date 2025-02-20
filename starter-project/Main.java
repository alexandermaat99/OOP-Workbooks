import constants.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;
import service.TradeAccountService;

public class Main {

  public static void main(String[] args) {
    try {
      loadTradeAccounts();
      applyTransactions();
      finalTest();
    } catch (IOException exception) {
      System.out.println(exception.getMessage());
    }
  }

  static Path[] paths = new Path[] {
    Paths.get("starter-project/data/accounts.txt"),
    Paths.get("starter-project/data/transactions.txt"),
  };
  //this declares  an array of Path objects called paths - it initializes it as an array of path objects
  // Paths.get turns a string into a path object
  //The path array now has 2 object, one is a path to the accounts file and the other to the transactions file

  static TradeAccountRepository tradeAccountRepository =
    new TradeAccountRepository();
  static CashAccountService cashAccountService = new CashAccountService(
    tradeAccountRepository
  );
  static MarginAccountService marginAccountService = new MarginAccountService(
    tradeAccountRepository
  );

  //initializing the repo and service layer

  public static void loadTradeAccounts() throws IOException {
    Files.lines(paths[0]).forEach(line -> {
      //this does the Files.lines at the file which is the first path in the paths array
      //does a for each line, which it's able to do since we did the Files.lines
      String[] words = line.split(" ");
      //creates a String array called words where it splits everything on the space
      //does this for each line of the file, so 4 lines would be 4 word arrays

      //cash or margin account?
      if (words[0].equals(TradeAccountType.CASH.toString())) {
        //takes the first position in the word array, if it equals the enum TradeAccountType.CASH
        cashAccountService.createTradeAccount(
          //creates a cashAccountService
          new CashAccount(words[1], new BigDecimal(words[2]))
          //pulls the data from position one and two from the word array
        );
      } else {
        //otherwise, it knows it's not a cash account and will create a marginAccountService
        marginAccountService.createTradeAccount(
          new MarginAccount(words[1], new BigDecimal(words[2]))
        );
      }
    });
  }

  public static void applyTransactions() throws IOException {
    Files.lines(paths[1]).forEach(line -> {
      String[] words = line.split(" ");
      Boolean isCash = (words[0].equals(TradeAccountType.CASH.toString()));
      TradeAccountService tradeAccountService = isCash
        ? cashAccountService
        : marginAccountService;
      //now we know if it's a cash or margin account
      //then we need to see if it's a Deposit or withdraw
      Transaction transactionType = Transaction.valueOf(words[2]);
      if (transactionType.equals(Transaction.DEPOSIT)) {
        tradeAccountService.deposit(words[1], new BigDecimal(words[3]));
      } else {
        tradeAccountService.withdraw(words[1], new BigDecimal(words[3]));
      }
    });
  }

  public static void finalTest() throws IOException {
    System.out.println(
      "Account A1234B Cash Balance: " +
      cashAccountService.retrieveTradeAccount("A1234B").getCashBalance()
    );
    System.out.println(
      "Account E3456F Cash Balance: " +
      cashAccountService.retrieveTradeAccount("E3456F").getCashBalance()
    );
    System.out.println(
      "Account I5678J Cash Balance: " +
      cashAccountService.retrieveTradeAccount("I5678J").getCashBalance()
    );
    System.out.println(
      "Account C2345D Margin: " +
      marginAccountService.retrieveTradeAccount("C2345D").getMargin()
    );
    System.out.println(
      "Account G4567H Margin: " +
      marginAccountService.retrieveTradeAccount("G4567H").getMargin()
    );
  }
}
