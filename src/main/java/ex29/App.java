package ex29;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float r;
        while(true) {
            try {
                r= Float.parseFloat(strIO("What is the rate of return? ",sc));
                if(r==0)
                {
                    throw new Exception();
                }
            } catch (Exception ex){
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            break;
        }
        int finalYears=yearsToDouble(r);

        System.out.println("It will take "+ finalYears + " years to double your initial investment.");

    }
    public static int yearsToDouble (float r){
        float years=(float)72/r;
        int finalYears;
        if(years - (int)years !=0)
        {
            finalYears= (int)(years+1);
        }
        else finalYears = (int)years;

        return finalYears;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
