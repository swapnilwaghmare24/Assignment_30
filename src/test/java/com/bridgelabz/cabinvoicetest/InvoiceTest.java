package com.bridgelabz.cabinvoicetest;

import com.bridgelabz.invoicegenerator.InvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {


    @Test
    public void checkFare()
    {
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double result=invoiceGenerator.calculateFare(5.0,10);
        Assert.assertEquals(60,result,0.0);

    }
}
