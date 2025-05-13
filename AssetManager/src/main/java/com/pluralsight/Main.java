package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My house", "04-16-2013", 115000, "10001 South 1st Street", 3, 2400, 9000));
        assets.add(new House("Vacation home", "07-22-2022", 355000, "3844 John Pork Drive", 4, 5000, 11000));

        assets.add(new Vehicle("Gio's car", "03-22-2023", 6000, "Infinti G35", 2010, 151000));
        assets.add(new Vehicle("Alice's Car", "11-19-2024", 11000, "Cadillac XT5", 2017, 79000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date acquired: " + asset.getDateAquired());
        }
    }
}
