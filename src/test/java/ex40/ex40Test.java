package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ex40Test {

    @Test
    void findRelatedVals() {
        ArrayList<HashMap<Integer,String>> aMap = App.fillVals();
        ArrayList<Integer> nums= App.findRelatedVals(aMap,"");
        assertEquals(nums.size(),6);
        nums.clear();
        nums = App.findRelatedVals(aMap,"z");
        assertEquals(nums.size(),0);
        nums.clear();
        nums = App.findRelatedVals(aMap,"J");
        assertEquals(nums.size(),3);
        Boolean check=true;
        for(int x:nums) {
            if (!aMap.get(0).get(x).substring(0,1).equalsIgnoreCase("J")&&!aMap.get(1).get(x).substring(0,1).equalsIgnoreCase("J")){
                check=false;
            }
        }
        assertTrue(check);
    }
}