package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex29Test {

    @Test
    void yearsToDouble() {
        assertEquals(App.yearsToDouble(4),18);
        assertEquals(App.yearsToDouble(3),24);
        assertEquals(App.yearsToDouble(2),36);
    }
}