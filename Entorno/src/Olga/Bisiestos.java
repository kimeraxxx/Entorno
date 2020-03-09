package Olga;

public class Bisiestos {
	int año = 0;
	assert(año>1080 && año>):""

	public static boolean Bisiesto( int año) {
		boolean respuesta=false;
		if (año % 4 == 0) {
			respuesta = true;
		}
		if (año % 100 == 0) {
			respuesta=false;
		}
		if (año % 400 == 0) {
			respuesta = true;

		}
		
		
		
		
		return respuesta;

	}
}
