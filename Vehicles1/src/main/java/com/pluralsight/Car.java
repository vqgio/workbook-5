package com.pluralsight;

public class Car extends Vehicle {
    String trim;
    int gasType;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String trim, int gasType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.trim = trim;
        this.gasType = gasType;
    }

    public int getGasType() {
        return gasType;
    }

    public void setGasType(int gasType) {
        if (gasType < 87) {
            System.out.println("Invalid gas type");
        } else {
            this.gasType = gasType;
        }
    }
}
