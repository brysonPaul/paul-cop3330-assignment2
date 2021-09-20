package ex27;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App
{
    static boolean outputtedError= false;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = strIO("Enter the first name: ",sc);
        String lastName = strIO("Enter the last name: ",sc);
        String ZIP = strIO("Enter the ZIP code: ",sc);
        String ID = strIO("Enter the employee ID: ",sc);
        validateInput(firstName,lastName,ZIP,ID);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
    static void  validateInput(String first, String last, String ZIP, String ID){

            isNameValid(first,"first");
            isNameValid(last, "last");
            if(!isValidZIP(ZIP)) {
                System.out.println("The zipcode must be a 5 digit number.");
                outputtedError=true;
            }
            if(!isIDValid(ID)){
                System.out.println("The employee ID must be in the format of AA-1234.");
                outputtedError=true;
            }
            if(!outputtedError){
                System.out.println("There were no errors found.");
            }
    }
    static boolean isNameFilled(String o) {
        return !o.isEmpty();
    }
    static boolean isNameLongEnough(String o){
        if(o.length() >= 2)
        {
            return true;
        }
        else return false;
    }
    static void isNameValid(String o, String firstOrLast)
    {
        if(!isNameFilled(o))
        {
            System.out.println("The "+firstOrLast+" name must be at least 2 characters long");
            System.out.println("The "+firstOrLast+" name must be filled in.");
            outputtedError=true;
        }
        else if(!isNameLongEnough(o)){
            System.out.println("The "+firstOrLast+" name must be at least 2 characters long");
            outputtedError=true;
        }
    }
    static boolean isIDValid(String o) {
        char[] c= o.toCharArray();
        boolean cond;
        for(int x=0;x<c.length;x++){
            if(x<2){
                cond=Character.isLetter(c[x]);
            } else if(x==2) {
                if(c[x]=='-')
                {
                    cond=true;
                }
                else cond=false;
            } else {
                cond=Character.isDigit(c[x]);
            }
            if(!cond) {
                return false;
            }
        }
        return true;
    }
    static boolean isValidZIP(String str)
    {
        if(str.length()!=5){
            return false;
        }
        try{
            Integer.parseInt(str);
        }catch (Exception ex ){
            return false;
        }
        return true;
    }
}
