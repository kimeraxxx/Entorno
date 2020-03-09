package Olga;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class PrimosTest {

	@Test
	void testComprobarPrimos() {
		boolean primos = false;
		assertTrue(Primos.comprobarPrimos(53));
	}

}
