package oop;

public class AreaTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaConstructor closet = new AreaConstructor ();
		AreaConstructor kitchen = new AreaConstructor ();
		kitchen = closet;
		AreaConstructor basement = new AreaConstructor ();
		closet = basement;
		closet.area();
		
		
	}

}
