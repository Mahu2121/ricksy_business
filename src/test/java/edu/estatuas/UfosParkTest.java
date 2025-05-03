
package edu.estatuas;

/**
 * Unit test for simple App.
 */
import org.junit.AfterClass;
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
    /*
    @Test
    public void dispatchNoCreditTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    /*
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    /*
    @Test
    public void dispatchNoUfoAvaliableTest() {
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    /*
    @Test
    public void getUfoOfTest() {
    }
    */
}
