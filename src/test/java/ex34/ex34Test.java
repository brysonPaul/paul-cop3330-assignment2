package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex34Test {

    @Test
    void isEmployee() {
        ArrayList<String> ar=new ArrayList<>();
        App.addEmployees(ar);
        assertFalse(App.isEmployee(ar,"John Jones"));
        assertFalse(App.isEmployee(ar,"Chris Jomes"));
        assertTrue(App.isEmployee(ar,"Chris Jones"));
        assertTrue(App.isEmployee(ar,"chris jones"));
    }
}