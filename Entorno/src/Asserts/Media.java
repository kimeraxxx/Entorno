package Asserts;

public class Media {
	int number, numberTwo;
	float half;

	public Media(int number, int numberTwo) {
		super();
		this.number = number;
		this.numberTwo = numberTwo;
		this.half = 0;
		contract();

	}

	private float getHalf() {
		this.half = this.number + this.numberTwo;
		this.half=this.half/2;
		return this.half;
	}

	private void contract() {
		assert (this.number < this.numberTwo) : "El primer numero es igual o mayor";
	}

	public static void main(String[] args) {
		Media media = new Media(5, 2);
		System.out.println(media.getHalf());
	}
}
