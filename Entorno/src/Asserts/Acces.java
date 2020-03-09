package Asserts;

public class Acces {
	String user, password;
	/*
	 * Este programa esta diseñado para que funcione para que falle si
	 * le metes un correo que no tenga @ y que tambien lo haga cuando la contraseña
	 * sea demasiada larga o corta.
	 */

	public Acces(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		contractUser();
		contractPass();
	}

	private boolean checkUser() {
		Boolean correct = true;
		char character = '@';
		int cont = 0;

		do {
			this.user.indexOf(character);
			cont++;
		} while (this.user.length() == cont);
		if (this.user.indexOf(character) == -1) {

			correct = false;
		}

		return correct;
	}

	private void contractUser() {
		assert (checkUser() == true) : "El correo que ha entrado no es correcto";
	}

	private void contractPass() {
		assert (this.password.length() > 8) : "La contraseña es demasiado corta";
		assert (this.password.length() < 16) : "La contraseña es demasiado larga";
	}

	public static void main(String[] args) {
		Acces acces = new Acces("hola@gmail.com", "adios45peroesteques");
	}
}
