package ex25;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App
{
    public static void main( String[] args )
    {
       Scanner sc= new Scanner(System.in);
       String password = strIO("Enter a password and I'll tell you it's strength: ",sc);
       int passStr = passwordValidator(password.toCharArray());
       String strengthStr=" ";
       if(passStr == 0)
       {
           strengthStr="very weak ";
       }
       else if(passStr == 1)
       {
           strengthStr="weak ";
       }
       else if(passStr == 2)
       {
           strengthStr="strong ";
       }
       else if(passStr == 3)
       {
           strengthStr="very strong ";
       }
       System.out.println("The password '"+password+"' is a "+strengthStr+"password");

    }
    public static int passwordValidator(char[] pass){
        boolean lengthTest = pass.length>=8?true:false;
        boolean hasNums = false;
        boolean hasLetters = false;
        boolean hasSpecialChars = false;

        for(char c: pass)
        {
            if(isNumber(c)) {
                hasNums = true;
            }
            else if(isLetter(c)) {
                hasLetters = true;
            }
            else if(isSpecialChar(c))
            {
                hasSpecialChars = true;
            }
        }
        if(hasNums && !hasLetters && !hasSpecialChars && !lengthTest){
            return 0;
        }
        else if(!hasNums && hasLetters && !hasSpecialChars && !lengthTest){
            return 1;
        }
        else if(hasNums && hasLetters && !hasSpecialChars && lengthTest){
            return 2;
        }
        else if(hasNums && hasLetters && hasSpecialChars && lengthTest) {
            return 3;
        }
        return -1;
    }
    public static boolean isNumber(char c){
        return Character.isDigit(c);
    }
    public static boolean isLetter(char c){
        return Character.isLetter(c);
    }
    public static boolean isSpecialChar(char c){
        return (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c));
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
