package Asserts;

public class Circulo {
	private float radio;
	private final float PI = 3.1416f;

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	private void setRadio(float radio) {
		this.radio = 5;
	}

	void areaCirculo() {
		if (this.radio > 0) {
			float area = this.radio * PI;
		}
	}
}
