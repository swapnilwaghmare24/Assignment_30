package com.bridgelabz.cabinvoicetest;

import com.bridgelabz.invoicegenerator.InvoiceGenerator;
import com.bridgelabz.rides.Rides;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceTest {

    InvoiceGenerator invoiceGenerator;
    @Before
    public void beforeTest()
    {
        invoiceGenerator=new InvoiceGenerator();
    }


    @Test
    public void checkFare()
    {
        double result=invoiceGenerator.calculateFare(5.0,10);
        Assert.assertEquals(60,result,0.0);
    }
    @Test
    public void checkMinimumFare()
    {
        double result=invoiceGenerator.calculateFare(3.0,5);
        Assert.assertEquals(50,result,0.0);

    }

    @Test
    public void multipleRidesCheckFare()
    {
        Rides rides=new Rides();
        Rides[] ride= {new Rides(5.0,10),
                new Rides(3.0,5)};
        double result=rides.calculateFare(ride);
        Assert.assertEquals(110,result,0.0);
    }
    @Test
    public void multipleRidesCheckAverageFare()
    {
        Rides rides=new Rides();
        Rides[] ride= {new Rides(5.0,10),
                new Rides(3.0,5)};
        double result=rides.calculateAverageFare(ride);
        Assert.assertEquals(55,result,0.0);
    }


}
