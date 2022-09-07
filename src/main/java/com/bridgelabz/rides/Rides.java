package com.bridgelabz.rides;

import com.bridgelabz.invoicegenerator.InvoiceGenerator;

public class Rides {
    double distance;
    int time;

    public Rides() {

    }

    public Rides(double distance, int time) {
        this.distance = distance;
        this.time = time;

    }

    public double calculateFare(Rides[] ride) {

        double totalFare = 0;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        for (Rides r : ride) {
            distance = r.distance;
            time = r.time;
            double fare = invoiceGenerator.calculateFare(distance, time);
            totalFare += fare;
        }
        return totalFare;
    }
}
