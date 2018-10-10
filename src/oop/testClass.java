package oop;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();
		bob.sayHello();
		Friend joe = new Friend();
		joe.sayMessage();
		System.out.println(bob.getAge());
		bob.setAge(67);
		System.out.println(bob.getAge());
		
	}

}
