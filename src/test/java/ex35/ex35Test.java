package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex35Test {

    @Test
    void chooseWinner() {
        ArrayList<String> ar= new ArrayList();
        ar.add("joe");
        ar.add("james");
        ar.add("maggie");
        ar.add("rob");

        for(int x=0;x<100;x++) {
            assertTrue(ar.contains(App.chooseWinner(ar)));
        }
    }
}