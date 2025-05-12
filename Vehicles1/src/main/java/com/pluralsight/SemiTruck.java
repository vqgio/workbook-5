package com.pluralsight;

public class SemiTruck extends Vehicle {
    String cabTrim;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String cabTrim) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.cabTrim = cabTrim;
    }
}
