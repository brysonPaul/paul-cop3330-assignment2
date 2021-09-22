package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<HashMap<Integer,String>> aMap = fillVals();
        String ss= strIO("Enter a search string: ",sc);
        ArrayList<Integer> pos = findRelatedVals(aMap,ss);
        System.out.println("Name                | Position          | Separation Date\n--------------------|-------------------|----------------");
        for(int x:pos){
            String name=String.format("%-20s",aMap.get(0).get(x)+" "+aMap.get(1).get(x)) ;
            String position=String.format("%-19s",aMap.get(2).get(x));
            String seperationDate = String.format("%-16s", aMap.get(3).get(x));
            System.out.println(name+"|"+position+"|"+seperationDate);
        }
    }
    public static ArrayList<Integer> findRelatedVals(ArrayList<HashMap<Integer,String>> aMap,String ss){
        ArrayList<Integer> pos= new ArrayList<>();
        for(int x=0;x<aMap.get(0).size();x++)
        {
            int size=ss.length();
            if(aMap.get(0).get(x).substring(0,size).equalsIgnoreCase(ss) || aMap.get(1).get(x).substring(0,size).equalsIgnoreCase(ss))
            {
                pos.add(x);
            }
        }
        return pos;
    }
    public static ArrayList<HashMap<Integer,String>> fillVals(){
        ArrayList<HashMap<Integer,String>> aMap = new ArrayList<>();
        aMap.add(new HashMap<Integer, String>());
        aMap.add(new HashMap<Integer, String>());
        aMap.add(new HashMap<Integer, String>());
        aMap.add(new HashMap<Integer, String>());

        aMap.get(0).put(0,"John");
        aMap.get(1).put(0,"Johnson");
        aMap.get(2).put(0,"Manager");
        aMap.get(3).put(0,"2016-12-31");

        aMap.get(0).put(1,"Tou");
        aMap.get(1).put(1,"Xiong");
        aMap.get(2).put(1,"Software Engineer");
        aMap.get(3).put(1,"2016-10-05");

        aMap.get(0).put(2,"Michaela");
        aMap.get(1).put(2,"Michaelson");
        aMap.get(2).put(2,"District Manager");
        aMap.get(3).put(2,"2015-12-19");

        aMap.get(0).put(3,"Jake");
        aMap.get(1).put(3,"Jacobson");
        aMap.get(2).put(3,"Programmer");
        aMap.get(3).put(3," ");

        aMap.get(0).put(4,"Jacquelyn");
        aMap.get(1).put(4,"Jackson");
        aMap.get(2).put(4,"DBA");
        aMap.get(3).put(4," ");

        aMap.get(0).put(5,"Sally");
        aMap.get(1).put(5,"Webber");
        aMap.get(2).put(5,"Web Developer");
        aMap.get(3).put(5,"2015-12-18");
        return aMap;
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
