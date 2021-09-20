package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String[] answers = new String[]{"Yes.","No.","Maybe.","Ask again later."};
        int indexChosen= (int)(Math.random()*4);
        strIO("What's your question?\n>",sc);
        System.out.println(answers[indexChosen]);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
