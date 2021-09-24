package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31Test {

    @Test
    void calculateTargetRate() {
        assertEquals(App.calculateTargetRate(65,22,(float).95),191);
        assertEquals(App.calculateTargetRate(65,22,(float).65),151);
        assertEquals(App.calculateTargetRate(65,22,(float).55),138);
        assertEquals(App.calculateTargetRate(65,22,(float).85),178);
    }
}