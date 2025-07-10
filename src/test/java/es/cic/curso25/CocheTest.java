package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CocheTest {

    Coche cut;

    @BeforeEach
    public void setUp() {
        cut = new Coche();
    }

    //@Disabled
    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);

        assertTrue(57 == velocidadFinal);
        assertEquals(57, velocidadFinal);
    }

    //@Disabled
    @Test
    void testFrenar() {
        cut.acelerar(18);
        cut.frenar(9);
        int velocidadFinal = cut.frenar(9);
        assertEquals(9, velocidadFinal);
    }

    //@Disabled
    @Test
    void testGetVelocidad() {
        cut.acelerar(18);
        int velocidadFinal = cut.getVelocidad();
        assertEquals(18, velocidadFinal);
    }

    //@Disabled
    @Test
    void testGetConsumo() {
        cut.acelerar(50);
        double velocidadFinal = cut.getConsumo();
        assertEquals(2.15, velocidadFinal);
    }
}
