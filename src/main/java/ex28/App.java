package ex28;

import java.util.ArrayList;
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
        int amtOfTimes= Integer.parseInt(strIO("How many numbers would you like to add? ",sc));
        int[] nums=new int[amtOfTimes];
        int num=0,sum=0;
        for(int x=0;x<amtOfTimes;x++)
        {
            try {
                num = Integer.parseInt(strIO("Enter a number ", sc));
            }
            catch (Exception ex){
                continue;
            }
            nums[amtOfTimes]=num;
        }
        sum=sum(nums);
        System.out.println("The total is "+sum);
    }
    public static int sum(int[] nums){
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return sum;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}

