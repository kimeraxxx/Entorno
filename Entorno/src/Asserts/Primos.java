package Asserts;

public class Primos {
	int number;

	public Primos(int primo) {
		super();
		this.number = primo;
		contract();
	}

	private boolean isCousin() {
		int contador = 2;
		boolean cousin = true;

		while ((cousin) && (contador != this.number)) {
			if (this.number % contador == 0)
				cousin = false;
			contador++;
		}

		return cousin;
	}
	private void contract() {
		assert (this.number>0):"El numero es cero o menor de cero";
	}
	public static void main(String[] args) {
		Primos primo = new Primos(0);
		System.out.println(primo.isCousin());
	}
}
