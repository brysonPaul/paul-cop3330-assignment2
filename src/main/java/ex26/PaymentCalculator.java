package ex26;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.ParseException;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class PaymentCalculator {

    private float dailyRate;//i
    private float balance;//b
    private float monthlyPayment;//p

    public void setDailyRate(double APR) {
        dailyRate = (float)APR/365;
    }
    public void setBalance(float balance) throws ParseException {
        DecimalFormat df= new DecimalFormat("#.##");
        this.balance = df.parse(df.format(balance)).floatValue();
    }
    public void setMonthlyPayment(float monthlyPayment) throws ParseException {
        DecimalFormat df= new DecimalFormat("#.##");
        this.monthlyPayment = df.parse(df.format(monthlyPayment)).floatValue();
    }
    public float calculateMonthsUntilPaidOff()
    {
        float first = -1/30;
        float secondP1 = (balance/monthlyPayment );
        float secondP2= (float) ((float) 1 - Math.pow(1 + (dailyRate),30));
        float second = (float) Math.log10(Math.abs(1+secondP1 * secondP2));
        float third = (float)Math.log10(1+(dailyRate));
        return first*second/third;
    }

}
