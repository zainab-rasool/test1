package day7;

public class ParentAss2 {
	
public void method1() {
		
		System.out.println("Parent Default method");
	}
 
	public void method2(int a) {
		System.out.println("Parent 1 parameterized method");
	}
	
	public void method3(int a, int b) {
		System.out.println("Parent 2 parameterized method");
	}

	public void method4(int a, int b, int c) {
		this.method1();
		this.method3(2, 5);
		this.method2(3);
		System.out.println("Parent 3 parameterized method");
	}


}
