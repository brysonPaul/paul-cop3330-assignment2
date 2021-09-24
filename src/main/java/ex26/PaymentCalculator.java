package ex26;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.ParseException;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class PaymentCalculator {

    private float monthyRate;//i
    private float balance;//b
    private float monthlyPayment;//p

    public void setMonthyRate(double APR) {
        monthyRate = (float)APR/12/100;
    }
    public void setBalance(float balance) throws ParseException {
        DecimalFormat df= new DecimalFormat("#.##");
        this.balance = df.parse(df.format(balance)).floatValue();
    }
    public void setMonthlyPayment(float monthlyPayment) throws ParseException {
        DecimalFormat df= new DecimalFormat("#.##");
        this.monthlyPayment = df.parse(df.format(monthlyPayment)).floatValue();
    }
    public int calculateMonthsUntilPaidOff()
    {
       double months = Math.log10(monthlyPayment/(monthlyPayment-(balance*monthyRate)))/Math.log10(1+monthyRate);
       if(months-(int)months >0){
           return (int)months+1;
       }
       else return (int)months;
    }
    public PaymentCalculator(double APR,float balance, float monthlyPayment) throws ParseException {
        setMonthyRate(APR);
        setBalance(balance);
        setMonthlyPayment(monthlyPayment);
    }
    public PaymentCalculator() {

    }
}
