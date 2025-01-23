package de.telran.homework_22092024;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
 public String displayInfo() {
      return "Car "+name+ " has speed maximal "+speed+" km/h.";


    }
}
