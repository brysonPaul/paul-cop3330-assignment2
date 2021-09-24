package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex27Test {

    @Test
    void isNameFilled() {
        assertFalse(App.isNameFilled(""));
        assertTrue(App.isNameFilled("hello"));
    }

    @Test
    void isNameLongEnough() {
        assertTrue(App.isNameLongEnough("jeff"));
        assertTrue(App.isNameLongEnough("je"));
        assertFalse(App.isNameLongEnough("j"));
        assertFalse(App.isNameLongEnough(""));
    }

    @Test
    void isIDValid() {
        assertFalse(App.isIDValid("A12-1234"));
        assertFalse(App.isIDValid("AA-12343"));
        assertFalse(App.isIDValid("AA-123"));
        assertTrue(App.isIDValid("AA-1234"));
        assertTrue(App.isIDValid("BP-1334"));
    }

    @Test
    void isValidZIP() {
        assertTrue(App.isValidZIP("33414"));
        assertFalse(App.isValidZIP("3341"));
        assertFalse(App.isValidZIP("334221"));
        assertFalse(App.isValidZIP("33r3r"));
    }
}