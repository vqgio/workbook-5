package com.pluralsight;

public class Asset {
    String description;
    String dateAquired;
    double originalCost;

    public Asset(String description, String dateAquired, double originalCost) {
        this.description = description;
        this.dateAquired = dateAquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public void setDateAquired(String dateAquired) {
        this.dateAquired = dateAquired;
    }

    public void setOriginalCost(double originalPrice) {
        this.originalCost = originalPrice;
    }

    public double getValue() {
        return originalCost;
    }

    public double getOriginalCost() {
        return originalCost;
    }
}
