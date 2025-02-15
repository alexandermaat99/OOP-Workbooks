package model;

public class Car {

  private String make;
  private String model;
  private BodyType bodyType;
  private int productionYear;
  private double price;

  public static final int minYear = 1900;
  public static final int minPrice = 0;
  public static final int maxPrice = 200_000;

  public enum BodyType {
    SEDAN,
    COUPE,
    HATCHBACK,
    SUV,
    TRUCK,
    Van,
  }

  //constructors
  public Car(
    String make,
    String model,
    BodyType bodyType,
    int productionYear,
    double price
  ) {
    setMake(make);
    setModel(model);
    setBodyType(bodyType);
    setProductionYear(productionYear);
    setPrice(price);
  }

  public Car(Car source) {
    setMake(source.getMake());
    setModel(source.getModel());
    setBodyType(source.getBodyType());
    setProductionYear(source.getProductionYear());
    setPrice(source.getPrice());
  }

  //getters
  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public BodyType getBodyType() {
    return this.bodyType;
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public double getPrice() {
    return this.price;
  }

  //setters
  public void setMake(String makeToSet) {
    if (makeToSet == null || makeToSet.isBlank()) {
      throw new IllegalArgumentException("Make cannot be null or blank");
    }
    this.make = makeToSet;
  }

  public void setModel(String modelToSet) {
    if (modelToSet == null || modelToSet.isBlank()) {
      throw new IllegalArgumentException("Model cannot be null or blank");
    }
    this.model = modelToSet;
  }

  public void setBodyType(BodyType bodyTypeToSet) {
    if (bodyTypeToSet == null) {
      throw new IllegalArgumentException("Bodytype cannot be null");
    }
    this.bodyType = bodyTypeToSet;
  }

  public void setProductionYear(int yearToSet) {
    if (yearToSet <= minYear) {
      throw new IllegalArgumentException(
        "Production year must be greater or equal to " + minYear
      );
    }
    this.productionYear = yearToSet;
  }

  public void setPrice(double priceToSet) {
    if (priceToSet <= minPrice || priceToSet >= maxPrice) {
      throw new IllegalArgumentException(
        "The price needs to be within the bounds (" +
        minPrice +
        "-" +
        maxPrice +
        ")"
      );
    }
    this.price = priceToSet;
  }
}
