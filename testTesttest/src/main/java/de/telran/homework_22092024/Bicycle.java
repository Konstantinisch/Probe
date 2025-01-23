package de.telran.homework_22092024;

public class Bicycle extends Vehicle{

    public Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String displayInfo() {
        return "Bicycle "+name+" has speed maximal "+speed+" km/h.";
    }
}
