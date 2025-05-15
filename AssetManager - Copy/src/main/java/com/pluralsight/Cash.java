package com.pluralsight;

public class Cash extends Asset {
    public Cash(String description, String dateAquired, double originalCost) {
        super(description, dateAquired, originalCost);
    }
    @Override
    public double getValue() {
        return getOriginalCost();
        //if we try to override get value we get a comp error bc its an abstract method
    }
}
