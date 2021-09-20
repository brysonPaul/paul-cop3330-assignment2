package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args) {
        for(int x=1; x<13; x++) {
            for(int y=1 ; y<13; y++){
                System.out.print(String.format("%-5d",y*x));
            }
            System.out.println();
        }
    }
}
