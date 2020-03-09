package Olga;

public class Potencias {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,num2 = 0;
		num=Leer.entero();
		num2=Leer.entero();
		int potencia=poten(num,num2);
		System.out.println(potencia);
	}
	public static int poten(int num,int num2) {
		return num^num2;
		}
}
