package com.pluralsight;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }


    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 5, 8, 125);
        System.out.println("here comes the SlowRide! Its the color " + slowRide.getColor() + " and it's a " + slowRide.getMopedCC() + "CC speed moped!");

//        slowRide.setColor("red");
//        slowRide.setNumberOfPassengers(1);
//        slowRide.setCargoCapacity(10);
//        slowRide.setFuelCapacity(20);
//        System.out.println("Cargo capacity for the slowRide is: " + slowRide.getCargoCapacity());
//        System.out.println("Number of passengers that can ride is :" + slowRide.getNumberOfPassengers());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers > 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            throw new RuntimeException("Number of passengers must be greater than 0");
        }
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
