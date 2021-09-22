package ex39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        ArrayList<HashMap<Integer,String>> aMap= fillVals();
       aMap = sortByLastName(aMap);
       System.out.println("Name                | Position          | Separation Date\n--------------------|-------------------|----------------");
       for(int x=0;x<aMap.get(0).size();x++){
           String name=String.format("%-20s",aMap.get(0).get(x)+" "+aMap.get(1).get(x)) ;
           String position=String.format("%-19s",aMap.get(2).get(x));
           String seperationDate = String.format("%-16s", aMap.get(3).get(x));
           System.out.println(name+"|"+position+"|"+seperationDate);
       }
    }
    public static ArrayList<HashMap<Integer,String>> sortByLastName(ArrayList<HashMap<Integer,String>> aMap){
        for(int x=0;x<aMap.get(0).size()-1;x++)
        {
            int sort=x;
            for(int y=x+1;y<aMap.get(0).size();y++){
                if((aMap.get(1).get(sort).compareTo(aMap.get(1).get(y))) > 0){
                    sort=y;
                }
            }
            String tempFirst= aMap.get(0).get(x);
            String tempLast= aMap.get(1).get(x);
            String tempPos= aMap.get(2).get(x);
            String tempDate= aMap.get(3).get(x);

            aMap.get(0).remove(x);
            aMap.get(1).remove(x);
            aMap.get(2).remove(x);
            aMap.get(3).remove(x);

            aMap.get(0).put(x,aMap.get(0).get(sort));
            aMap.get(1).put(x,aMap.get(1).get(sort));
            aMap.get(2).put(x,aMap.get(2).get(sort));
            aMap.get(3).put(x,aMap.get(3).get(sort));

            aMap.get(0).remove(sort);
            aMap.get(1).remove(sort);
            aMap.get(2).remove(sort);
            aMap.get(3).remove(sort);

            aMap.get(0).put(sort,tempFirst);
            aMap.get(1).put(sort,tempLast);
            aMap.get(2).put(sort,tempPos);
            aMap.get(3).put(sort,tempDate);
        }
        return aMap;
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

