package oop;

public class Worker {
	private int hours;
	private double pay;

	public Worker(){
		hours = 0;
		pay = 0.0;
	}
	public Worker(int newL, double newW){
		hours = newL;
		pay = newW;
	}
	public void setHours(int newL){
		hours = newL;
	}
	public void setPay(double newW){
		pay = newW;	
	}
	public void setRaise(double newSalary){
		pay = newSalary;
	}
	public int getHours(){
		return hours;
	}
	public double getPay(){
		return pay;
	}
	public double getRaise(){
		return pay + 1.1;
}
}