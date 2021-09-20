package ex32;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean controller=false;
        System.out.println("Let's play Guess the Number!");
        do {
            int randomVar=0;
            int input=0;
            int guesses=0;
            try{
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                 input=Integer.parseInt(sc.next());
            }catch (Exception ex){
                System.out.println("Enter only numeric data please");
                controller=true;
                continue;
            }
            switch(input){
                case 1: randomVar = (int)((Math.random()*10)+1);
                        break;
                case 2: randomVar = (int)((Math.random()*100)+1);
                        break;
                case 3: randomVar =  (int)((Math.random()*1000)+1);
            }
            System.out.print("I have my number. What's your guess? ");
            while(true){
                try {
                    guesses++;
                    input = Integer.parseInt(sc.next());

                    if (input == randomVar) {
                        System.out.println("You got it in " + guesses + " guesses!");
                        break;
                    } else if (input > randomVar) {
                        System.out.print("Too high. Guess again: ");
                    } else System.out.print("Too low. Guess again: ");
                }
                catch (Exception ex){
                    System.out.print("Guess again: ");

                }
            }
            System.out.print("\nDo you wish to play again (Y/N)? ");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("Y")){
                controller=true;
            }
            else if(choice.equalsIgnoreCase("N")){
                controller=false;
            }
        }while(controller);

    }
}
