package ex26;
import java.text.ParseException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App
{
    public static void main( String[] args ) throws ParseException {
        Scanner sc = new Scanner(System.in);
        PaymentCalculator p = new PaymentCalculator();

        p.setBalance(Float.parseFloat(strIO("What is your balance? ",sc)));
        p.setMonthyRate(Float.parseFloat(strIO("What is the APR on the card (as a percent)? ",sc)));
        p.setMonthlyPayment(Float.parseFloat(strIO("What is the monthly payment you can make? ",sc)));
        System.out.println("It will take you "+p.calculateMonthsUntilPaidOff()+" months to pay off this card.");

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
