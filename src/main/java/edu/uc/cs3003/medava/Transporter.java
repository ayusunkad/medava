package edu.uc.cs3003.medava;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;

// Transporter class represents a vehicle for shipping and transporting medical goods.
public class Transporter {

    // Constructor to initialize a Transporter with a name and temperature range.
    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    // Instance initialization block to create a new ArrayList for storing goods.
    {
        goods = new ArrayList<Shippable>();
    }

    // Private fields to store transporter name, goods, and temperature range.
    private String mTransporterName;
    private List<Shippable> goods;
    private double mLowTemperature, mHighTemperature;

    // Getter method to retrieve the name of the transporter.
    public String getTransporterName() {
        return mTransporterName;
    }

    // Method representing the shipping process. (Placeholder comment)
    public void ship() {
    }

    // Method to unload the first item from the goods list.
    public Shippable unload() {
        return goods.remove(0);
    }

    // Method to load a Shippable item onto the transporter, checking temperature range.
    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            return goods.add(itemToLoad);
        }
        // Return false if the item's temperature is not within the acceptable range.
        return false;
    }

    // Method to check if the transporter is empty.
    public boolean isEmpty() {
        return goods.isEmpty();
    }
}
