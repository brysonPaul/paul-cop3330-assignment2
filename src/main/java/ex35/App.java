package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
import java.util.ArrayList;
import java.util.Scanner;
public class App {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            ArrayList<String> names= new ArrayList<>();
            String nameHold="e";
            do{
                names.add(strIO("Enter a name: ",sc));
                if(names.get(names.size()-1).equalsIgnoreCase("")){
                    break;
                }
            } while(true);

            names.remove(names.size()-1);
            int index= (int) ( (float)Math.random()*names.size() );
            System.out.println("The winner is... "+names.get(index)+".");
        }
        public static String strIO(String input, Scanner sc){
            System.out.print(input);
            String output = sc.nextLine();
            return output;
        }
}
