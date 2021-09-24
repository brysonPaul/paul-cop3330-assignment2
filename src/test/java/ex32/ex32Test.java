package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex32Test {

    @Test
    void createRandomVar() {
        for(int x=0;x<100000;x++){
            assertTrue(1<=App.createRandomVar(1)&&App.createRandomVar(1)<=10);
            assertTrue(1<=App.createRandomVar(2)&&App.createRandomVar(2)<=100);
            assertTrue(1<=App.createRandomVar(3)&&App.createRandomVar(3)<=1000);
        }
    }
}