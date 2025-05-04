
package edu.estatuas;

/**
 * Unit test for simple App.
 */
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UfosParkTest {

    /**
     * Testea el metodo añadir ovni
     * a la flota de ufos
     */

    @Test
    public void addUfoTest() {
        UfosPark ufos = new UfosPark();
        String[] ovnis = { "unx", "dox", "trex" };
        for (String ovni : ovnis) {
            ufos.add(ovni);
        }
        assertEquals("[trex, dox, unx]", ufos.toString());
    }

    /**
     * Testea el metodo reservar ovni
     * y cargar el pago en la tarjeta
     * de crédito.
     * El crédito de la tarjeta varía.
     */

    @Test
    public void dispatchTest() {
        UfosPark ufos = new UfosPark();
        String[] ovnis = { "unx", "dox", "trex" };
        for (String ovni : ovnis) {
            ufos.add(ovni);
        }
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        ufos.dispatch(abradolph);

        assertEquals("trex",ufos.getUfoOf(abradolph.number()));

    }

    /**
     * Testea que no se pueda reservar un ovni
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */

    @Test
    public void dispatchNoCreditTest() {
        UfosPark ufos = new UfosPark();
        String[] ovnis = { "unx", "dox", "trex" };
        for (String ovni : ovnis) {
            ufos.add(ovni);
        }
        CreditCard fer = new CreditCard("Ferdinan", "3691611971192321");
        fer.pay(3000.0);
        ufos.dispatch(fer);
        assertNull(ufos.getUfoOf(fer.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */

    @Test
    public void dispatchUfoAlreadyReservedTest() {
        UfosPark ufos = new UfosPark();
        String[] ovnis = { "unx", "dox", "trex" };
        for (String ovni : ovnis) {
            ufos.add(ovni);
        }
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        ufos.dispatch(abradolph);

        assertEquals("trex",ufos.getUfoOf(abradolph.number()));

       ufos.dispatch(abradolph);

       assertEquals("trex",ufos.getUfoOf(abradolph.number()));



    }

    /**
     * Testea que no se pueda reservar un ovni
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */

    @Test
    public void dispatchNoUfoAvaliableTest() {
        UfosPark ufos = new UfosPark();
        String[] ovnis = { "unx", "dox", "trex" };
        for (String ovni : ovnis) {
            ufos.add(ovni);
        }
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        CreditCard fer = new CreditCard("Ferdinan Fernandez", "3691611971192321");
        CreditCard manu = new CreditCard("Manuel Escobilla", "5641312971101331");
        CreditCard nuno = new CreditCard("Nuno Venavides", "9765423922761831");

        ufos.dispatch(abradolph);
        ufos.dispatch(fer);
        ufos.dispatch(manu);
        ufos.dispatch(nuno);

        assertNull(ufos.getUfoOf(nuno.number()));


    }
}
