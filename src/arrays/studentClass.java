package arrays;

public class studentClass {

	private String name;
	private int grade;

	public studentClass() {
		name = "";
		grade = 0;
	}

	public studentClass(String xName, int xGrade) {
		name = xName;
		grade = xGrade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String xName) {
		name = xName;
	}

	public void setGrade(int xGrade) {
		grade = xGrade;
	}
}
