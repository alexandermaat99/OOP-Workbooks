public class City {

  private String name;
  private String country;
  private long population;

  public City(String name, String country, long population) {
    setName(name);
    setCountry(country);
    setPopulation(population);
  }

  public City(City source) {
    setName(source.getName());
    setCountry(source.getCountry());
    setPopulation(source.getPopulation());
  }

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

  public void setCountry(String newCountry) {
    if (newCountry == null || newCountry.isBlank()) {
      throw new IllegalArgumentException("Country cannot be null or blank");
    } else {
      this.country = newCountry;
    }
  }

  public void setPopulation(long newPopulation) {
    if (newPopulation <= 0) {
      throw new IllegalArgumentException("Population must be greater than 0");
    } else this.population = newPopulation;
  }
}
