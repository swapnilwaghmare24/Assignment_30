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
        int count=0;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        for (Rides r : ride) {
            count++;
            distance = r.distance;
            time = r.time;
            double fare = invoiceGenerator.calculateFare(distance, time);
            totalFare += fare;
        }
        System.out.println("total number of rides = "+count);
        System.out.println("total fare = "+totalFare);
        double averageFare=totalFare/count;
        return totalFare;
    }

    public double calculateAverageFare(Rides[] ride) {
        double totalFare = 0;
        int count=0;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        for (Rides r : ride) {
            count++;
            distance = r.distance;
            time = r.time;
            double fare = invoiceGenerator.calculateFare(distance, time);
            totalFare += fare;
        }
        System.out.println("total number of rides = "+count);
        System.out.println("total fare = "+totalFare);
        double averageFare=totalFare/count;
        System.out.println("average fare = "+averageFare);
        return averageFare;

    }
}
