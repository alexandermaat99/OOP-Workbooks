package model;

import java.util.ArrayList;

public class Lab {

  public ArrayList<LabEquipment> labEquipments;

  public Lab() {
    //initializing LabEquipments as an empty array.
    this.labEquipments = new ArrayList<>();
  }

  public LabEquipment getLabEquipment(int index) {
    return labEquipments.get(index).clone();
  }

  public void setLabEquipment(LabEquipment equipmentToSet, int index) {
    labEquipments.set(index, (equipmentToSet.clone()));
  }

  public void addLabEquipment(LabEquipment equipmentToAdd) {
    labEquipments.add(equipmentToAdd.clone());
  }
}
