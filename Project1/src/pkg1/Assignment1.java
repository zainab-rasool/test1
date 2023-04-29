package pkg1;

//Day2-Assignment 1
public class Assignment1 {
	
	public int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public int multiply(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public void divide(int a, int b) {
		int result = a/b;
        System.out.println("Expression result (((((10+2)+2)-2)*2)/2) = " +result);
}
	
	public static void main(String[] args) {
		
		Assignment1 obj=new Assignment1();
		int result1=obj.sum(10, 2);
		int result2=obj.sum(result1, 2);
		int result3=obj.sub(result2, 2);
		int result4=obj.multiply(result3, 2);
		obj.divide(result4, 2);
		
	}
	
	
	
}
