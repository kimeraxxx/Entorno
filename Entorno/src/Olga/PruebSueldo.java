package Olga;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebSueldo {

	@Test
	public void testSueldo() {
		int resultado=SueldoTrabajo.Sueldo(10, 10);
		int esperado=120;
		assertFalse(resultado==esperado);
	}

}
