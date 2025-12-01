package org.jgnn.demo.math.ope;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubstracaoTest {
	
	 @Test
	 public void testSubtrairValoresPositivos() {
	        Substracao sub = new Substracao();
	        double resultado = sub.subtrair(10, 5);
	        assertEquals(5.0, resultado, "10 - 5 deveria ser 5");
	    }

	    @Test
	    public void testSubtrairComZero() {
	        Substracao sub = new Substracao();
	        double resultado = sub.subtrair(10, 0);
	        assertEquals(10.0, resultado, "10 - 0 deveria ser 10");
	    }

	    @Test
	    public void testSubtrairValoresNegativos() {
	        Substracao sub = new Substracao();
	        double resultado = sub.subtrair(-3, -7);
	        assertEquals(4.0, resultado, "-3 - (-7) deveria ser 4");
	    }

}
