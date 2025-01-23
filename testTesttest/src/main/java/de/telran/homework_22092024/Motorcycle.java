package de.telran.homework_22092024;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name, int speed) {
        super(name, speed);
    }

    @Override
public String displayInfo() {
        return "Motorcycle "+name+" has speed maximal "+speed+" km/h.";


    }
}
