import java.util.HashMap;

public class CityPopulationTracker {

  private HashMap<String, City> cityPopulations;

  //this declares a HashMap called cityPopulations, but it is not created yet

  public CityPopulationTracker() {
    cityPopulations = new HashMap<>();
  }

  public City getCity(String cityToGet) {
    return new City(cityPopulations.get(cityToGet));
  }

  public void setCity(City cityToSet) {
    cityPopulations.put(cityToSet.getName(), new City(cityToSet));
  }

  public void addCity(City cityToAdd) {
    cityPopulations.put(cityToAdd.getName(), new City(cityToAdd));
  }
}
