package com.pluralsight;

public class Moped extends Vehicle {
    int mopedCC;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int mopedCC) {
        super(color, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.mopedCC = mopedCC;
    }

    public int getMopedCC() {
        return mopedCC;
    }

    public void setMopedCC(int mopedCC) {
        this.mopedCC = mopedCC;
    }
}
