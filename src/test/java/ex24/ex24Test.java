package ex24;

import static org.junit.jupiter.api.Assertions.*;
class ex24Test {

    @org.junit.jupiter.api.Test
    void isAnagram() {
       boolean a = App.isAnagram("true","false");
       boolean b = App.isAnagram("true","brue");
       boolean c = App.isAnagram("hello","olleh");

       assertFalse(a);
       assertFalse(b);
       assertTrue(c);

    }
}