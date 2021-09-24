package ex36;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36Test {

    @Test
    void average() {
        ArrayList<Integer> testNums= new ArrayList<>();
        testNums.add(5);
        testNums.add(100);
        testNums.add(-1);
        for(int x=0;x<10;x++){
            testNums.add(x);
        }
        DecimalFormat df= new DecimalFormat("#.##");
        assertEquals(df.format(App.average(testNums)),"11.46");
    }

    @Test
    void max() {
        ArrayList<Integer> testNums= new ArrayList<>();
        testNums.add(5);
        testNums.add(100);
        testNums.add(-1);
        for(int x=0;x<20;x++){
            testNums.add(x);
        }
        assertEquals(App.max(testNums),100);
    }

    @Test
    void min() {
        ArrayList<Integer> testNums= new ArrayList<>();
        testNums.add(5);
        testNums.add(100);
        testNums.add(-1);
        for(int x=0;x<20;x++){
            testNums.add(x);
        }
        assertEquals(App.min(testNums),-1);
    }

    @Test
    void std() {
        ArrayList<Integer> testNums= new ArrayList<>();
        testNums.add(5);
        testNums.add(100);
        testNums.add(-1);
        for(int x=0;x<10;x++){
            testNums.add(x);
        }
        DecimalFormat df= new DecimalFormat("#.##");
        assertEquals(df.format(App.std(testNums)),"25.73");
    }
}