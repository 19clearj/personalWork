package arrays;

public class classDesignPTDefinition {
	static private int companyProductNumber = 0;
	private int productNumber;
	private String myNumber;
	final static private int maxMinutes = 1000;
	private int minutesUsed;

	public classDesignPTDefinition(String xMyNumber, int xMinutesUsed) {
		myNumber = xMyNumber;
		minutesUsed = xMinutesUsed;
		productNumber = companyProductNumber;
		companyProductNumber++;
	}

	public void makeCall(int moreMinutes) {
		minutesUsed += moreMinutes;
	}

	public int getRemaingMin() {
		int time = maxMinutes - minutesUsed;
		return time;
	}

	public void reset() {
		minutesUsed = 0;
	}

	public Object clone() {
		return new classDesignPTDefinition(myNumber, minutesUsed);
	}

	public String toString() {
		return "classDesignPTDefinition object: My number" + myNumber + "Minutes used: " + minutesUsed;
	}

	public boolean equals(Object one, Object two) {
		if (one.toString().compareTo(two.toString()) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
