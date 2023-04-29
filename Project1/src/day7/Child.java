package day7;

public class Child extends Parent{
	
	public Child() {
		this(2,5);
		System.out.println("Child Default constructor");
	}
 
	public Child(int a) {
		this(2,6,3);
		System.out.println("Child 1 parameterized constructor");
	}
	
	public Child(int a, int b) {
		super(2,5);
		System.out.println("Child 2 parameterized constructor");
	}

	public Child(int a, int b, int c) {
		this();
		System.out.println("Child 3 parameterized constructor");
	}
	
	

	public static void main(String[] args) {
		Child obj=new Child(2);
		
	
	}

}
