package oop;

public class RightTriangle {
	private double base;
	private double height;
	//constructors
	public RightTriangle(){
		base = 0.0;
		height = 0.0;
	}
	public RightTriangle(double newBase, double newHeight){
		base = newBase;
		height = newHeight;
	}
	//mutator methods
	public void setBase(double newBase){
		base = newBase;
	}
	public void setHeight(double newHeight){
		height = newHeight;
	}
	//accessor methods
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	public double hypot(){

		return Math.hypot(base, height);
	}
	public double perimeter(){

		return (base) + (height) + (Math.hypot(base, height));
	}
	public double area(){
		return (base *height) /2.0;
	}
}
