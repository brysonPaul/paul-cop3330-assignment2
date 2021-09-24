package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex38Test {

    @Test
    void filterEvenNumbers() {
        String[] numArr= new String[]{"2","3","4","10","12","67","65","22","39"};
        ArrayList<String> ar= App.filterEvenNumbers(numArr);
        for(int x=0;x<numArr.length;x++){
            if(Integer.parseInt(numArr[x])%2==0){
                assertTrue(ar.contains(numArr[x]));
            }
            else assertFalse(ar.contains(numArr[x]));
        }
    }
}