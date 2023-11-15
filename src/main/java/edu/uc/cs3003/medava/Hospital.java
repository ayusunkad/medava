package edu.uc.cs3003.medava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Hospital class represents a medical facility that can receive shipments of medicines.
public class Hospital {

    // Constructor to initialize a Hospital with a given name.
    public Hospital(String hospitalName) {
        name = hospitalName;
    }

    // Method to receive a shipment of medicines transported by a Transporter.
    void receive(Transporter t) {
        // Continue unloading medicines until the transporter is empty.
        while (!t.isEmpty()) {
            Shippable unloaded = t.unload();

            // Check if the unloaded medicine is a controlled substance.
            System.out.println(String.format("Checking whether Hospital can receive %s.", unloaded.getMedicineName()));
            if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) {
                // If it's a controlled substance, inform that the hospital cannot receive it.
                System.out.println(String.format("Hospital cannot receive controlled substances and %s is a %s.",
                        unloaded.getMedicineName(), unloaded.getSchedule().asString()));
            } else {
                // Accept the shipment if the medicine is not a controlled substance.
                System.out.println(String.format("Accepted a shipment of %s.", unloaded.getMedicineName()));
            }
        }
    }

    // Getter method to retrieve the name of the hospital.
    public String name() {
        return name;
    }

    // Private field to store the name of the hospital.
    private String name;
}
