package arrays;

public class SodaCan {
	double radius;
	double height;

	public SodaCan(double xRadius, double xHeight) {
		radius = xRadius;
		height = xHeight;
	}

	public String toString() {
		return "SodaCan object: radius: " + radius + "height:" + height;
	}
	public boolean equals (Object one, Object two){
		if(one.toString().compareTo(two.toString()) == 0){
			return true;
		} else{
			return false;
		}
	}
	public Object clone(){
		return new SodaCan(radius, height);
	}
}
