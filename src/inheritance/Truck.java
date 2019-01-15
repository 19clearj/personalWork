package inheritance;

public class Truck extends Auto {
	private boolean four;

	public Truck(int xO, int xM, boolean xW) {
		super(xO, xM);
		four = xW;
	}

	public boolean getFourWD() {
		return four;
	}

	public String toString() {
		return "Truck object: " + super.toString() + "Four wheel drive?: " + four;
	}

	public boolean equals(Object anObject) {
		if (this.toString().equals(anObject.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
