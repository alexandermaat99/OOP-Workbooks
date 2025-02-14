import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String cityName = promptForCityName(scanner);

    String country = promptForCountry(scanner);

    long population = promptForPopulation(scanner);

    City newCity = new City(cityName, country, population);

    CityPopulationTracker tracker = new CityPopulationTracker();
    tracker.addCity(newCity);

    System.out.println("City added to the tracker: " + newCity.getName());
  }

  public static boolean isNullOrBlank(String inputToCheck) {
    return (inputToCheck == null || inputToCheck.isBlank());
  }

  public static boolean incorrectPopulation(long population) {
    return population < 0;
  }

  public static String promptForCityName(Scanner scanner) {
    while (true) {
      System.out.print("Please enter a valid city name: ");
      String cityName = scanner.nextLine();
      if (!isNullOrBlank(cityName)) {
        return cityName;
      }
    }
  }

  public static String promptForCountry(Scanner scanner) {
    while (true) {
      System.out.println("Please enter a valid country: ");
      String countryName = scanner.nextLine();
      if (!isNullOrBlank(countryName)) {
        return countryName;
      }
    }
  }

  public static long promptForPopulation(Scanner scanner) {
    while (true) {
      System.out.println("Please enter a valid population:");
      if (!scanner.hasNextLong()) {
        scanner.next();
        continue;
      }

      long population = scanner.nextLong();
      if (!incorrectPopulation(population)) {
        return population;
      }
    }
  }
}
