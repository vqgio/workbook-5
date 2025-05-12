package com.pluralsight;

public class Hovercraft extends Vehicle {
    String numberOfTurbines;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String numberOfTurbines) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfTurbines = numberOfTurbines;
    }
}
