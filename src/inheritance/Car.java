package inheritance;

public class Car extends Auto {
	private int cups;

	public Car(int xO, int xM, int xC) {
		super(xO, xM);
		cups = xC;
	}

	public int getCupHolders() {
		return cups;
	}
}
