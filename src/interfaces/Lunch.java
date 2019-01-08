package interfaces;

public class Lunch implements Meal {
	private boolean school;
	private int prepTime;
	private int calories;

	public Lunch(int xprepTime, int xCalories) {
		prepTime = xprepTime;
		calories = xCalories;
		school = true;
	}

	public boolean hadEggs() {
		return true;
	}

	public int getCalories() {
		return calories;
	}

	public String toString() {
		return "Lunch object: school: " + school + "Preptime: " + prepTime + "School: " + school;
	}

	public Object clone() {
		return new Lunch(calories, prepTime);
	}
}
