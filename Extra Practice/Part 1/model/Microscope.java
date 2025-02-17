package model;

public class Microscope extends LabEquipment {

  private final int minMagnification = 1;

  private int magnification;

  public Microscope(
    String manufacturer,
    String model,
    int year,
    int magnification
  ) {
    super(manufacturer, model, year);
    setMagnification(magnification);
  }

  public Microscope(Microscope source) {
    super(source);
    setMagnification(source.magnification);
  }

  //getter
  public int getMagnification() {
    return this.magnification;
  }

  //setter

  public void setMagnification(int magnificationToSet) {
    if (magnificationToSet < minMagnification) {
      throw new IllegalArgumentException(
        "Manigication must be greater or equal to " + minMagnification
      );
    }
    this.magnification = magnificationToSet;
  }

  @Override
  public String performMaintenance() {
    return (
      "Microscope maintenance: Clean the lenses and check the light source. "
    );
  }

  @Override
  public Microscope clone() {
    return new Microscope(this);
  }
}
