package oop;

public class Cat {
	private int age;
	private int sleep;
	//constructors
	public Cat(){
		age = 0;
		sleep= 0;
	}
	public Cat(int newAge){
		age = newAge;
	}
	//mutator methods
	public void setAge (int newAge){
		age = newAge;
	}
	public void setSleep (int newSleep){
		sleep = newSleep;
	}
	//accessor methods
	public double getAge(){
		return age;
	}
	public int birthday(){
		return age + 1;
	}
	public double getSleep(){

		return sleep;
	}
	public double sleepMore(){

		return sleep + 4;
	}
	public double sleepLess(){

		return sleep - 4;
	}
}