package Asserts;

public class Bisiesto {
	private int day, month;
	private int year;

	public Bisiesto(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		contract();
	}

	private boolean isLeap() {
		boolean leap = false;
		if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))){
			
			leap = true;
		}
		return leap;
	}

	private void contract() {
		assert (this.year > 1800 && this.year < 10000) : "No es una fecha valida";

	}

	public static void main(String[] args) {
		Bisiesto bisiesto = new Bisiesto(14, 11, 500);
		
	}
}
