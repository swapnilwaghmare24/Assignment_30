package com.bridgelabz.invoicegenerator;

public class InvoiceGenerator {
    private static final double RATE_PER_KM = 10;
    private static final double MINIMUM_FARE = 50;


    public double calculateFare(double distance, int time)
    {
        double fare=RATE_PER_KM*distance+time;
        if(fare>MINIMUM_FARE)
        return fare;
        return MINIMUM_FARE;
    }
}
