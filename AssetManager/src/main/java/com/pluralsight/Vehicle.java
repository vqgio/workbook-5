package com.pluralsight;

public class Vehicle extends Asset{
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double value = getOriginalCost();

        if (age >= 0 && age <= 3) {
            value *= Math.pow(0.97, age); //3% depreciation
        } else if (age >= 4 && age <= 6) {
            value *= Math.pow(0.94, age = 3) * Math.pow(0.97, 3); //6% depreciation
        } else if (age >= 7 && age <= 10) {
            value *= Math.pow(0.92, age - 6) * Math.pow(0.94, 3) * Math.pow(0.97, 3);
        } else {
            value = 1000.00;
        }
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }
        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
