package model;

public class Centrifuge extends LabEquipment {

  private final int minRPM = 500;
  private int maxRPM;

  public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
    super(manufacturer, model, year);
    setMaxRPM(maxRPM);
  }

  public Centrifuge(Centrifuge source) {
    super(source);
    setMaxRPM(source.getRPM());
  }

  //getters
  public int getRPM() {
    return this.maxRPM;
  }

  //setters
  public void setMaxRPM(int RPMToSet) {
    if (RPMToSet < minRPM) {
      throw new IllegalArgumentException(
        "Max RPM must be larger or equal to " + minRPM
      );
    }
    this.maxRPM = RPMToSet;
  }

  @Override
  public String performMaintenance() {
    return (
      "Centrifuge maintenance: check the rotor, clean the chamber, and lubricate the spindle."
    );
  }

  @Override
  public Centrifuge clone() {
    return new Centrifuge(this);
  }
}
