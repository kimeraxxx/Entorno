package Olga;

import static org.junit.Assert.*;

import org.junit.Test;

public class BisiestosTest {

	@Test
	public void testBisiesto() {
		
		boolean respuesta = true;
		int año = 1900;

		assertEquals(respuesta, Bisiestos.Bisiesto( año));

	}
}
