package oop;

public class Trap {
private double base1;
private double base2;
private double height;
private double leg;

public Trap(){
	base1 = 0.0;
	base2 = 0.0;
	height = 0.0;
	leg = 0.0;
}
public Trap(double newBase1, double newBase2, double newHeight, double newLeg){
	base1= newBase1;
	base2= newBase2;
	height = newHeight;
	leg = newLeg;
}
public void setBase1(double newBase1){
	base1 = newBase1;
}
public void setBase2(double newBase2){
	base2 = newBase2;
}
public void setHeight(double newHeight){
	height = newHeight;
}
public void setLeg(double newLeg){
	leg = newLeg;
}
public double getBase1(){
	return base1;
}
public double getBase2(){
	return base2;
}
public double getHeight(){
	return height;
}
public double getLeg(){
	return leg;
}
public double perimeter(){
	return base1+base2+(2*(leg));
}
public double area(){
	return ((base1+base2)*height)/2;
}
}

