package day7;

public class Parent {
	public Parent() {
		this(2,6,9);
		System.out.println("Parent Default constructor");
	}
 
	public Parent(int a) {
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public Parent(int a, int b) {
		this(3);
		System.out.println("Parent 2 parameterized constructor");
	}

	public Parent(int a, int b, int c) {
		System.out.println("Parent 3 parameterized constructor");
	}


}
