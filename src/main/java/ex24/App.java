package ex24;

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
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String first = strIO("Enter the first string: ",sc);
        String second = strIO("Enter the first string: ",sc);
        boolean check = isAnagram(first,second);
        if(check)
        {
            System.out.println("\""+first+"\" and \""+second+"\" are anagrams");
        }
        else
        {
            System.out.println("\""+first+"\" and \""+second+"\" are not anagrams");
        }

    }
    public static boolean isAnagram(String first,String second) {
        boolean found;
        if (first.length() != second.length()) {
            return false;
        }
        for (int x = 0; x < first.length(); x++) {
            found = false;
            char c1 = first.charAt(x);
            for (int y = 0; y < second.length(); y++) {
                char c2 = second.charAt(y);
                if (c1 == c2) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return false;
            }
        }
        return true;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
