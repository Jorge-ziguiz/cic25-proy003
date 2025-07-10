package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Preparo
    private Calculadora cut = new Calculadora();

    @Test
    public void testSumar() {
        cut.reiniciarTotal();
        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);

        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void restar() {
        cut.reiniciarTotal();
        cut.restar(30);
        double valorActual = cut.getTotal();
        valorActual = cut.getTotal();
        assertEquals(valorActual, -30, 0.000001);
    }

    @Test
    public void dividir() {
        cut.reiniciarTotal();
        cut.sumar(15);
        cut.dividir(3);
        double valorActual = cut.getTotal();
        assertEquals(valorActual, 5, 0.000001);

    }

    @Test
    public void multiplicar() {
        cut.reiniciarTotal();
        cut.sumar(5);
        cut.multiplicar(3);
        double valorActual = cut.getTotal();
        assertEquals(valorActual, 15, 0.000001);
    }

    @Test
    public void reiniciarTotal() {
        cut.sumar(10);
        cut.reiniciarTotal();
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);

    }

}
