package oop;

public class CircleClass {
	//instance fields
private double radius;
//constructors
//default constructor
public CircleClass(){
	radius = 0.0;
}
// alternate constructor
public CircleClass(double newRadius){
	if (newRadius>= 0){
		newRadius = 10;
	}
	radius = newRadius;
	
}
//mutator methods
public void setRadius(double newRadius){
	if(newRadius >= 0){
		newRadius = 10;
	}
	radius = newRadius;
}
//accessor methods
public double getRadius(){
	return radius;
}
public double circumference(){

	return 2*Math.PI*radius;
}
public double area(){

	return Math.PI*radius*radius;
}
}
