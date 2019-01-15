package inheritance;

public class Auto {
	private int odometer;
	private int mPG;

	public Auto() {
		odometer = 0;
		mPG = 30;
	}

	public Auto(int xO, int xM) {
		odometer = xO;
		mPG = xM;
	}

	public int getO() {
		return odometer;
	}

	public int getMPG() {
		return mPG;
	}

	public void drive(int miles) {
		if (miles > 0) {
			odometer += miles;
		} else {
			odometer += 30;
		}
	}

	public String toString() {
		return "Auto object: Odometer: " + odometer + " mPG" + mPG;
	}
}
