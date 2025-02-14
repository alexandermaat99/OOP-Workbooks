public class City {

  private String name;
  private String country;
  private long population;

  public City(String name, String country, long population) {}

  //getters
  public String getName() {
    return this.name;
  }

  public String getCountry() {
    return this.country;
  }

  public long getPopulation() {
    return this.population;
  }

  //setters

  public void setName(String newName) {
    if ((newName == null) || newName.isBlank()) {
      throw new IllegalArgumentException("Name cannot be null or blank");
    } else {
      this.name = newName;
    }
  }

  public void setCountry(String newCountry);
}
