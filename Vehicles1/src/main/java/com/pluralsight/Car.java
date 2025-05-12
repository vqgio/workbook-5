package com.pluralsight;

public class Car extends Vehicle {
    String trim;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String trim) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.trim = trim;
    }
}
