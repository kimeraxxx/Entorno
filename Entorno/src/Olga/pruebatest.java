package Olga;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebatest {

	@Test
	public void testSuma() {
		int resultado=Prueba2.suma(3, 2);
		int esperado=5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testResta() {
		int resultado=Prueba2.div(6, 2);
		int esperado=3;
		assertEquals(esperado, resultado);
	}
}
