package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ex39Test {

    @Test
    void sortByLastName() {
        ArrayList<HashMap<Integer,String>> aMap= App.fillVals();
        App.sortByLastName(aMap);
        assertEquals(aMap.get(0).get(3),"Michaela");
        assertEquals(aMap.get(1).get(3),"Michaelson");//test for middle
        assertEquals(aMap.get(2).get(3),"District Manager");
        assertEquals(aMap.get(3).get(3),"2015-12-19");

        assertEquals(aMap.get(0).get(5),"Tou");
        assertEquals(aMap.get(1).get(5),"Xiong");
        assertEquals(aMap.get(2).get(5),"Software Engineer");//test for end
        assertEquals(aMap.get(3).get(5),"2016-10-05");
    }
}