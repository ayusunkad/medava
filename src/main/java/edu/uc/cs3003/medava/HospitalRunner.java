package edu.uc.cs3003.medava;

// HospitalRunner class contains a static method to demonstrate the interaction between a Pharmacy, Hospital, and Transporter.
public class HospitalRunner {

    // Static method to run the demonstration.
    public static void run() {
        // Create a Transporter named "Priority Dispatch" with a temperature range of 40.0 to 41.0.
        Transporter priorityDispatch = new Transporter("Priority Dispatch", 40.0, 41.0);

        // Create a Pharmacy named "CVS at 7500 Beechmont Avenue".
        Pharmacy cvs = new Pharmacy("CVS at 7500 Beechmont Avenue");

        // Send medicines and a medical device from the pharmacy using the priorityDispatch transporter.
        cvs.send(priorityDispatch);

        // Create a Hospital named "World Famous University of Cincinnati Children's Hospital".
        Hospital uc = new Hospital("World Famous University of Cincinnati Children's Hospital");

        // Receive medicines and a medical device at the hospital using the same priorityDispatch transporter.
        uc.receive(priorityDispatch);
    }
}
