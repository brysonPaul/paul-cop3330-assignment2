package ex37;



import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        int minLength=0,amtSpecialChars=0,amtNums=0;
        while(true) {
            try {
                minLength = Integer.parseInt(strIO("What's the minimum length? ", sc));
                amtSpecialChars = Integer.parseInt(strIO("How many special characters? ", sc));
                amtNums = Integer.parseInt(strIO("How many numbers? ", sc));
            } catch (Exception ex){
                System.out.println("Please enter numeric values only");
                continue;
            }
            break;
        }
        int amtLetters=0;
        if(2*(amtNums+amtSpecialChars)<minLength){
            amtLetters= minLength-(amtNums+amtSpecialChars);
        }
        else amtLetters=amtNums+amtSpecialChars;

        amtLetters+=randomAddition();
        ArrayList<Character> password = generatePass(amtNums,amtLetters,amtSpecialChars);
        System.out.println("Your password is ");
        for(char c:password){
            System.out.print(c);
        }
    }
    public static ArrayList<Character> generatePass(int nums, int letters, int specials){
        ArrayList<Character> specChars= addSpecialChars();
        ArrayList<Character> password = new ArrayList<>();
        System.out.println(nums+letters+specials);
        while(true){
            int rand= (int)(Math.random()*3);

            if(rand==0 && nums>0){
                System.out.println("num");
                nums--;
                String ch= ""+(int)(Math.random()*10);
                password.add( ch.toCharArray()[0]);

            }
            else if(rand==1 && letters>0)
            {
                System.out.println("letters");
                letters--;
                int val=0;
                if((int)(Math.random()*2)==1)
                {
                    val=65;
                }
                else val=97;
                int letter = (int)(Math.random()*26)+val;
                password.add((char)letter);
            }
            else if(rand == 2 && specials>0){
                System.out.println("specials");
                specials--;
                int chosen= (int)(Math.random()*specChars.size());
                password.add(specChars.get(chosen));
            }
            else if (nums==0 && letters==0 && specials==0) {
                break;
            }
            else{
               continue;
            }

        }
        return password;
    }
    public static ArrayList<Character> addSpecialChars()
    {
        ArrayList<Character> chars= new ArrayList<>();
        chars.add('!');
        chars.add('@');
        chars.add('#');
        chars.add('$');
        chars.add('%');
        chars.add('^');
        chars.add('&');
        chars.add('*');
        chars.add('(');
        chars.add(')');
        chars.add('~');
        chars.add('_');
        chars.add('+');
        chars.add('-');
        chars.add('=');
        return chars;
    }
    public static int randomAddition(){
        int counter=0;
        for(int x=1;x<(int)(Math.random()*15);x++){
            if((int)(Math.random()*5)+1==1){
                break;
            }
            counter++;
        }
        return counter;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}

