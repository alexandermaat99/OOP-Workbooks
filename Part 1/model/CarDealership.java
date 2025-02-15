package model;

import java.util.ArrayList;

public class CarDealership {

  private ArrayList<Car> cars;

  public CarDealership() {
    cars = new ArrayList<>();
  }

  public Car getCar(int index) {
    return new Car(cars.get(index));
  }

  public void setCar(Car carToSet, int index) {
    cars.set(index, new Car(carToSet));
  }

  public void addCar(Car carToAdd) {
    cars.add(new Car(carToAdd));
  }
}
