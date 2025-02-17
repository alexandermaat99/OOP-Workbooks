package model;

public abstract class LabEquipment {

  private final int minimumYear = 1050;

  private String manufacturer;
  private String model;
  private int year;

  public LabEquipment(String manufacturer, String model, int year) {
    setManufacturer(manufacturer);
    setModel(manufacturer);
    setYear(year);
  }

  //copy constructor
  public LabEquipment(LabEquipment source) {
    setManufacturer(source.getManufacturer());
    setModel(source.getModel());
    setYear(source.getYear());
  }

  //getters
  public String getManufacturer() {
    return this.manufacturer;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }

  //setters
  public void setManufacturer(String manufacturerToSet) {
    if (manufacturerToSet == null || manufacturerToSet.isBlank()) {
      throw new IllegalArgumentException(
        "Manufacturer cannot be null or blank"
      );
    }
    this.manufacturer = manufacturerToSet;
  }

  public void setModel(String modelToSet) {
    if (modelToSet == null || modelToSet.isBlank()) {
      throw new IllegalArgumentException("Model cannot be null or blank");
    }
    this.model = modelToSet;
  }

  public void setYear(int yearToSet) {
    if (yearToSet < minimumYear) {
      throw new IllegalArgumentException(
        "Year must be greater than or equal to " + minimumYear
      );
    }
    this.year = yearToSet;
  }

  public abstract String performMaintenance();

  public abstract LabEquipment clone();
}
