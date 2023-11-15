package edu.uc.cs3003.medava;

public class Pharmacy {

    // Constructor to initialize a Pharmacy with a given name.
    public Pharmacy(String pharmacyName) {
        mPharmacyName = pharmacyName;
    }

    // Method to send various medicines and a medical device using a given transporter.
    public boolean send(Transporter t) {
        // Create an instance of Ibuprofen and attempt to load it onto the transporter.
        Medicine advil = new Ibuprofen();
        if (t.load(advil)) {
            System.out.println(String.format("Sending %s on the %s transporter.", advil.getMedicineName(),
                    t.getTransporterName()));
        } else {
            // Print a message if Ibuprofen cannot be loaded onto the transporter and return false.
            System.out.println(String.format("Cannot load %s onto the %s transporter.", advil.getMedicineName(),
                    t.getTransporterName()));
            return false;
        }

        Medicine activase = new Thrombolytic();
        if (t.load(activase)) {
            System.out.println(String.format("Sending %s on the %s transporter.", activase.getMedicineName(),
                    t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s onto the %s transporter.", activase.getMedicineName(),
                    t.getTransporterName()));
            return false;
        }

        Medicine oxycontin = new Oxycodone();
        if (t.load(oxycontin)) {
            System.out.println(String.format("Sending %s on the %s transporter.", oxycontin.getMedicineName(),
                    t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s onto the %s transporter.", oxycontin.getMedicineName(),
                    t.getTransporterName()));
            return false;
        }

        Jarvik heart = new Jarvik("01j9a9lk71");
        if (t.load(heart)) {
            System.out.println(String.format("Sending %s on the %s transporter.", heart.getMedicineName(),
                    t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s onto the %s transporter.", heart.getMedicineName(),
                    t.getTransporterName()));
            return false;
        }

        // Return true if all items are successfully loaded onto the transporter.
        return true;
    }

    // Getter method to retrieve the name of the pharmacy.
    public String pharmacyName() {
        return mPharmacyName;
    }

    // Private field to store the name of the pharmacy.
    private String mPharmacyName;
}
