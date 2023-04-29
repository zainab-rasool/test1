package pkg1;

//Day3-Assignment1
public class ClassA {
	
	public ClassA() {
		this(2,5,6);
		System.out.println("Default constructor");
	}
	
	public ClassA(int a) {
		this();
		System.out.println("One parameterized constructor");
	}
	
	public ClassA(int a, int b) {
		this(2, 4, 6, 7);
		System.out.println("Two parameterized constructor");
	}
	
	public ClassA(int a, int b, int c) {
		System.out.println("Three parameterized constructor");
	}
	
	public ClassA(int a, int b, int c, int d) {
		this(99);
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) {
		ClassA obj=new ClassA(5, 4); 
	}
	
	

}
