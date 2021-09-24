package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25Test {

    @Test
    void passwordValidator() {
        assertEquals(App.passwordValidator("12345".toCharArray()),0);
        assertEquals(App.passwordValidator("abcdef".toCharArray()),1);
        assertEquals(App.passwordValidator("abc123xyz".toCharArray()),2);
        assertEquals(App.passwordValidator("1337h@xor!".toCharArray()),3);
    }

    @Test
    void isNumber() {
        assertFalse(App.isNumber('E'));
        assertFalse(App.isNumber('!'));;
        assertTrue(App.isNumber('1'));
    }

    @Test
    void isLetter()
    {
        assertFalse(App.isLetter('1'));
        assertFalse(App.isLetter('!'));
        assertTrue(App.isLetter('E'));
        assertTrue(App.isLetter('e'));
    }

    @Test
    void isSpecialChar() {
        assertFalse(App.isSpecialChar('1'));
        assertFalse(App.isSpecialChar('e'));
        assertTrue(App.isSpecialChar('!'));
        assertTrue(App.isSpecialChar('@'));
    }
}