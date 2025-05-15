package com.pluralsight;

public class House extends Asset{
    String address;
    //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    int condition;
    int squareFoot;
    int lotSize;
    public House(String description, String dateAquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if (condition > 0)
            if (condition < 4) {
                this.condition = condition;
            } else {
                throw new RuntimeException("Condition must be between 0 and 4");
            }
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue() {
        double pricePerSquareFoot;
        switch (condition) {
            case 1:
                pricePerSquareFoot = 180.0;
                break;
            case 2:
                pricePerSquareFoot = 130.0;
                break;
            case 3:
                pricePerSquareFoot = 90.0;
                break;
            case 4:
                pricePerSquareFoot = 80.0;
                break;
            default:
                pricePerSquareFoot = 0.0;
        }
        return (squareFoot * pricePerSquareFoot) + (lotSize * 0.25);
    }
}
