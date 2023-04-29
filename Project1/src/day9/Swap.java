package day9;

//Day9 - Assignment 1 and Assignment 2
public class Swap {
	
	public void swapWithThirdVariable(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = " +b);
	}
	
	public void swapWithoutThirdVariable(int a, int b) {
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = " +b);
	}
	
	public static void main(String[] args) {
		int a=12, b=15;
		Swap obj=new Swap();
		System.out.println("Swapping of two number using third variable");
		obj.swapWithThirdVariable(a, b);
		System.out.println("Swapping of two number without using third variable");
		obj.swapWithoutThirdVariable(a, b);
	}

}
