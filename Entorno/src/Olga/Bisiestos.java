package Olga;

public class Bisiestos {
	int a�o = 0;
	assert(a�o>1080 && a�o>):""

	public static boolean Bisiesto( int a�o) {
		boolean respuesta=false;
		if (a�o % 4 == 0) {
			respuesta = true;
		}
		if (a�o % 100 == 0) {
			respuesta=false;
		}
		if (a�o % 400 == 0) {
			respuesta = true;

		}
		
		
		
		
		return respuesta;

	}
}
