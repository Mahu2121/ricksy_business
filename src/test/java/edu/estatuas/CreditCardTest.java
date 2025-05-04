package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void getNameTest() {
        CreditCard fer = new CreditCard("Ferdinan Fernandez", "3691611971192321");
        assertEquals("Ferdinan Fernandez",fer.getName());
    }

    @Test
    public void getNumberTest() {
        CreditCard fer = new CreditCard("Ferdinan Fernandez", "3691611971192321");
        assertEquals("3691611971192321",fer.getNumber());
    }

    @Test
    public void getCreditTest() {
        CreditCard fer = new CreditCard("Ferdinan Fernandez", "3691611971192321");
        assertEquals(3000.0,fer.getCredit(),2);
    }

    @Test
    public void payTest() {
        CreditCard fer = new CreditCard("Ferdinan Fernandez", "3691611971192321");
        fer.pay(2000.0);
        assertEquals(1000.0,fer.getCredit(),2);
    }


}
