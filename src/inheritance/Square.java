package inheritance;

public class Square extends Rectangle {
	public Square() {
		super();
	}

	public Square(double x1) {
		super(x1, x1);
	}
	public String toString() {
		return "Square Object: " + super.toString();
	}
	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}
}
