package Olga;

public class Primos {
public static boolean comprobarPrimos(int numero) {
	boolean primos = false;
	int contador=0;
	
	for (int i = 1; i < numero+1; i++) {
		if (numero % i==0) {
			contador++;
		}
	}
	if (contador==2){
	primos=true;
		
	}
		
	

	return primos;
	
	
}

	
	
}

