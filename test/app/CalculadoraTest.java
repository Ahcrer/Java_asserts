package app;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.*;

public class CalculadoraTest {

    Calculadora cal = new Calculadora();

    @DisplayName("Prueba de suma exitosa")
    @Test
    public void pruebaSuma() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    @DisplayName("Prueba de suma erronea")
    public void pruebaSumaError() {
        assertNotEquals(5, cal.add(3, 3));
    }

    @Test
    public void pruebaResta() {
        assertEquals(4, cal.substact(5, 1));
    }

    @Test
    public void pruebaRestaError() {
        assertNotEquals(6, cal.substact(6, 7));
    }

    @Test
    public void pruebaMultiplicar() {
        assertEquals(25, cal.multipy(5, 5));
    }

    @Test
    public void pruebaMultiplicarError() {
        assertNotEquals(32, cal.multipy(5, 5));
    }

    @Test
    public void pruebaDividir() {
        assertEquals(2, cal.divide(10, 5), 0);
    }

    @Test
    public void pruebaDividirError() {
        assertNotEquals(2, cal.divide(5, 10));
    }

}