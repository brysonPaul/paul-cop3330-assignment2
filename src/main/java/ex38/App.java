package ex38;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String nums=strIO("Enter a list of numbers, separated by spaces: ",sc);
        String[] numArr= nums.split(" ");
        ArrayList<String> evenNums= filterEvenNumbers(numArr);
        System.out.print("The even numbers are ");
        for(String i:evenNums){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<String> filterEvenNumbers(String[] numArr) {

        ArrayList<String> str = new ArrayList<>();
        for (String i : numArr) {
            int hold = Integer.parseInt(i);
            if (hold % 2 == 0) {
                str.add(i);
            }
        }
        return str;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }

}
