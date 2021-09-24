package ex26;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class ex26Test {

    @Test
    void calculateMonthsUntilPaidOff() throws ParseException {
        PaymentCalculator p= new PaymentCalculator(12,5000,100);
        PaymentCalculator p1= new PaymentCalculator(14,12000,400);
        assertEquals(p.calculateMonthsUntilPaidOff(),70);
        assertEquals(p1.calculateMonthsUntilPaidOff(),38);

    }
}