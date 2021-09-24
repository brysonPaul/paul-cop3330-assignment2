package ex34;

import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar= new ArrayList<>();
        addEmployees(ar);
        System.out.println("There are "+ar.size()+" employees:");
        for(String s:ar){
            System.out.println(s);
        }
        String nameToRemove=strIO("\nEnter an employee name to remove: ",sc);

        if(!isEmployee(ar,nameToRemove)){
            System.out.println("That is not an employee.");
            return;
        }
        for(int x=0;x<ar.size();x++){
            if(ar.get(x).equalsIgnoreCase(nameToRemove))
            {
                ar.remove(x);
                System.out.println("\nThere are "+ar.size()+" employees");
                for(String s:ar){
                    System.out.println(s);
                }
                return;
            }
        }

    }
    public static boolean isEmployee(ArrayList<String> ar,String s){
        for(String s1:ar){
            if(s1.equalsIgnoreCase(s)) return true;
        }
        return false;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
    public static void addEmployees(ArrayList<String> ar){
        ar.add("John Smith");
        ar.add("Jackie Jackson");
        ar.add("Chris Jones");
        ar.add("Amanda Cullen");
        ar.add("Jeremy Goodwin");
    }

}
