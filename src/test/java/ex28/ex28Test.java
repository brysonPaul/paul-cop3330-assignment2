package ex28;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex28Test {

    @Test
    void sum() {
        assertEquals(App.sum(new int[]{5,2,3}),10);
        assertEquals(App.sum(new int[]{0,0,0}),0);
        assertEquals(App.sum(new int[]{-1,4,3}),6);
    }
}