package pkg1;

//Day2-Assignment 2
public class Assignment2 {

	public int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public void multiply(int a, int b) {
		int result = a*b;
		System.out.println("Expression result (((((10/2)-2)+2)-2)*2) = " +result);
	}
	
	public int divide(int a, int b) {
		int result = a/b;
        return result;
}
	
	public static void main(String[] args) {
		
		Assignment2 obj=new Assignment2();
		int result1=obj.divide(10, 2);
		int result2=obj.sub(result1, 2);
		int result3=obj.sum(result2, 2);
		int result4=obj.sub(result3,2);
		obj.multiply(result4, 2);
				
		
	}
	


}
