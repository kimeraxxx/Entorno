package Asserts;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean correct = false;
		String frase="hola@";
		char character = '@';
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			frase.indexOf(character);
				cont++;
			
		}
		System.out.println(frase.indexOf(character));
		if (cont >= 0) {
			correct = true;
		}
	}

}
