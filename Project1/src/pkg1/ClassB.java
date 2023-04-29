package pkg1;

//Day3-Assignment2
public class ClassB {
	
	public void method() {
		System.out.println("Default method");
	}
	
	public void method1(int a) {
		System.out.println("One Parameterized method");
	}

	public void method2(int a, int b) {
		
		System.out.println("Two Parameterized method");
	}

	public void method3(int a, int b, int c) {
		this.method4(1, 5, 7, 8);
		this.method();
		this.method1(2);
		System.out.println("Three Parameterized method");
		this.method2(5, 6);
	}
	
	public void method4(int a, int b, int c, int d) {
		System.out.println("Four Parameterized method");
	}
	
	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.method3(3,6,9);
	}


}
