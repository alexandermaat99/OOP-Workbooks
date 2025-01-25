public class Movie {

  //attributes
  private String name;
  private String format;
  private double rating;

  //constructor
  public Movie(String name, String format, double rating) {
    this.name = name;
    this.format = format;
    this.rating = rating;
  }

  //copy constructor
  public Movie(Movie source) {
    this.name = source.getName();
    this.format = source.getFormat();
    this.rating = source.getRating();
  }

  //getters and setters
  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String newFormat) {
    this.format = newFormat;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double newRating) {
    this.rating = newRating;
  }

  //toString method
  public String toString() {
    return this.rating + "\t" + this.format + "\t\t" + this.name;
  }
}
