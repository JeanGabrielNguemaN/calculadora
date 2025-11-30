package org.jgnn.demo.math.ope;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jgnn.demo.math.ope.*;
import org.junit.jupiter.api.Test;

public class SomaTest {

    @Test
    public void testSomarValoresPositivos() {
    	
        Soma soma = new Soma();
        double resultado = soma.somar(10, 5);
        assertEquals(15.0, resultado, "10 + 5 deveria ser 15");
    }

    /*
    @Test
    public void testSomarComZero() {
        Soma soma = new Soma();
        double resultado = soma.somar(10, 0);
        assertEquals(10.0, resultado, "10 + 0 deveria ser 10");
    }

    @Test
    public void testSomarValoresNegativos() {
        Soma soma = new Soma();
        double resultado = soma.somar(-3, -7);
        assertEquals(-10.0, resultado, "-3 + (-7) deveria ser -10");
    }
    */
}
