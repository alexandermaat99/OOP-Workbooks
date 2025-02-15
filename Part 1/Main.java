import static model.Car.*;

import java.util.Scanner;
import model.Car;
import model.Car.BodyType;
import model.CarDealership;

// import model.CarDealership;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String make = promptForMake(scanner);
    String model = promptForModel(scanner);
    BodyType bodyType = promptForBodyType(scanner);
    int year = promptForYear(scanner);
    double price = promptForPrice(scanner);

    Car newCar = new Car(make, model, bodyType, year, price);

    CarDealership dealership = new CarDealership();
    dealership.addCar(newCar);

    System.out.println(
      "Car added to the dealership: " +
      newCar.getMake() +
      " " +
      newCar.getModel()
    );
  }

  public static boolean isNullOrBlank(String stringToCheck) {
    return (stringToCheck == null || stringToCheck.isBlank());
  }

  public static boolean invalidYear(int yearToCheck) {
    return (yearToCheck < minYear);
  }

  public static boolean invalidPrice(double priceToCheck) {
    return (priceToCheck <= minPrice || priceToCheck >= maxPrice);
  }

  public static boolean invalidBodyType(String stringToCheck) {
    try {
      BodyType.valueOf(stringToCheck.toUpperCase());
      return false;
    } catch (IllegalArgumentException e) {
      return true;
    }
  }

  public static BodyType promptForBodyType(Scanner scanner) {
    while (true) {
      System.out.print("Please enter a valid body: ");
      String stringToCheck = scanner.nextLine();
      if (!invalidBodyType(stringToCheck)) {
        return BodyType.valueOf(stringToCheck.toUpperCase());
      }
    }
  }

  public static String promptForMake(Scanner scanner) {
    while (true) {
      System.out.print("Please enter a valid make: ");
      String attemptedModel = scanner.nextLine();
      if (!isNullOrBlank(attemptedModel)) {
        return attemptedModel;
      }
    }
  }

  public static String promptForModel(Scanner scanner) {
    while (true) {
      System.out.print("Please enter a valid model: ");
      String atemptedModel = scanner.nextLine();
      if (!isNullOrBlank(atemptedModel)) {
        return atemptedModel;
      }
    }
  }

  public static int promptForYear(Scanner scanner) {
    while (true) {
      int attemptedYear = 0;
      System.out.print("Please enter a valid production year: ");
      if (scanner.hasNextInt()) {
        attemptedYear = scanner.nextInt();
      } else {
        scanner.next();
        continue;
      }

      if (!invalidYear(attemptedYear)) {
        return attemptedYear;
      }
    }
  }

  public static double promptForPrice(Scanner scanner) {
    while (true) {
      System.out.print("Please enter a valid price: ");
      if (!scanner.hasNextDouble()) {
        scanner.next();
        continue;
      }
      double attemptedPrice = scanner.nextDouble();

      if (!invalidPrice(attemptedPrice)) {
        return attemptedPrice;
      }
    }
  }
}
