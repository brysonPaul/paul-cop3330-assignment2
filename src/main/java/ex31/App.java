package ex31;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int restingRate=0;
        int age=0;
        while(true) {
            try {
                restingRate = Integer.parseInt(strIO("Please enter your resting heart rate: ", sc));
                age = Integer.parseInt(strIO("Please enter your age: ", sc));
            } catch(Exception ex){
                System.out.println("Please enter numeric values only");
                continue;
            }
            break;
        }
        printOutput(restingRate,age);

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
    static void printOutput(int restingRate,int age){
        System.out.println("Resting Pulse: 65        Age: 22\n\nIntensity    | Rate\n-------------|-------- ");//top of header
        for(float intensity=(float).55;intensity<.96;intensity+=.05) {
            int targetRate = calculateTargetRate(restingRate,age,intensity);
            System.out.println((int)(intensity*100)+"%          | "+targetRate+" bpm");
        }
    }
    public static int calculateTargetRate(int restingRate,int age, float intensity){
        float targetHeartRate =( ( (220 - age) - restingRate) * (intensity) + restingRate);
        int intTargetRate=0;
        if(targetHeartRate-(int)targetHeartRate>=.5)
        {
            intTargetRate= (int)targetHeartRate+1;
        }
        else intTargetRate=(int)targetHeartRate;

        return intTargetRate;
    }
}
