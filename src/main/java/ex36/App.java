package ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        DecimalFormat df= new DecimalFormat("#.##");
        while(true){
            try{
                String hold = strIO("Enter a number: ",sc);
                if(hold.equalsIgnoreCase("done")){
                    break;
                }
                else{
                    nums.add(Integer.parseInt(hold));
                }
            }
            catch(Exception ex){
                System.out.println("Enter only numeric values");
                continue;
            }
        }
        System.out.print("Numbers: ");
        for(Integer i:nums){
            System.out.print(i+", ");
        }
        System.out.println("\nThe average is "+df.format(average(nums)));
        System.out.println("The minimum is "+min(nums));
        System.out.println("The maximum is "+max(nums));
        System.out.println("The standard deviation is "+df.format(std(nums)));

    }
    public static double average(ArrayList<Integer> nums)
    {
        double sum=0;
        for(Integer i:nums){
            sum+=i;
        }
        return sum/nums.size();
    }
    public static double max(ArrayList<Integer> nums)
    {
        double max=Double.MIN_VALUE;
        for(Integer i:nums) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static double min(ArrayList<Integer> nums)
    {
        double min=Double.MAX_VALUE;
        for(Integer i:nums) {
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static double std(ArrayList<Integer> nums)
    {
        double sideOne=0;
        double sum=0;
        for(Integer i:nums){
            sideOne+=(i*i);
            sum+=i;
        }
       double sideTwo= (sum*sum)/nums.size();
       double variance=(sideOne-sideTwo)/(nums.size());
       return Math.sqrt(variance);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
