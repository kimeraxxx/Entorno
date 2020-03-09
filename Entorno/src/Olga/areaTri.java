package Olga;

public class areaTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int base=0,altura=0,areaTri=0;
		areaTri=areaTriangulo(base,altura,areaTri);
	}

	public static int areaTriangulo(int base, int altura, int areaTri) {
		// TODO Auto-generated method stub
		base=Leer.entero();
		altura=Leer.entero();
		areaTri=base*altura/2;
		System.out.println("El area del triangulo es "+areaTri);
		return areaTri;
	}

}
