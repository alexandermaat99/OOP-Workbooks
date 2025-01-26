public class Main {

  public static void main(String[] args) {
    // **************** Immutable Object ****************
    Integer applesWrapper = 5;
    int applWrapper = 5;

    Integer applesWrapper2 = applesWrapper; // SAFE
    int applWrapper2 = applWrapper;
    applesWrapper2 = 10;
    applWrapper2 = 10;

    System.out.println(applesWrapper);
    System.out.println(applesWrapper2);

    System.out.println(applWrapper);
    System.out.println(applWrapper2);

    // **************** Mutable Object ****************

    City city = new City("Paris", 2161000);
    City secondCity = new City(city);

    city.setPopulation(2261000);
    secondCity.setPopulation(2263400);
    city.setPopulation(2163400);
    secondCity.setPopulation(2443400);
  }
}
