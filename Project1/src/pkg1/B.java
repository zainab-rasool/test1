package pkg1;

public class B {
	
	public int add(int a, int b) {
		int result=a+b;
		System.out.println("Sum result is = " +result);
		return result;
	}
	
	
	public int sub(int a, int b) {
		int result=a-b;
		System.out.println("Subtraction result is = " +result);
		return result;
	}
	
	public void multiply(int a, int b) {
		int result=a*b;
		System.out.println("Multiplication result is = " +result);
	}
	
	public static void main(String[] args) {
		B obj=new B();
		int sum=obj.add(10,2);
		int sub=obj.sub(10,2);
		obj.multiply(sum, sub);

		
	}

}
