package day8;

//Day8-Assignment 2
public class Practice {
	
	
	public static void method1() {
		System.out.println("static method1");
	}
	
	//Calling static method from non static method
	public void method2() {
		System.out.println("Non static method2");
		this.method1();
		method1();
		Practice.method1();
	}
	
	
	public static void main(String[] args) {
		Practice obj=new Practice();
		
		//Calling static method from static method
		obj.method1();
		method1();
		Practice.method1();
		
		
		//Calling non static method from static method
		obj.method2();
		
		
	}


}
