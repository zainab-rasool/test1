package pkg1;

import java.util.Scanner;

//Day5-Assignment2
public class AssignmentExpression2 {
	
	public static void main(String[] args) {
		
		//Using has a relationship
		ArithmeticMethod obj2=new ArithmeticMethod();
		
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter value of x1");
		int x1=ref.nextInt();
		
		System.out.println("Enter value of x2");
		int x2=ref.nextInt(); 
		
		int result1=obj2.multiply(x1, x2);
		
		System.out.println("Enter value of x3");
		int x3=ref.nextInt(); 
		
		int result2=obj2.sub(result1, x3);
		
		System.out.println("Enter value of x4");
		int x4=ref.nextInt(); 
		
		int result3=obj2.add(result2, x4);
		
		System.out.println("Enter value of x5");
		int x5=ref.nextInt(); 
		
		int result4=obj2.sub(result3, x5);
		
		System.out.println("Enter value of x6");
		int x6=ref.nextInt(); 
		
		int result5=obj2.divide(result4, x6);
		
		System.out.println("(((((x1*x2)-x3)+x4)-x5)/x6) =" +result5);
		
	}

}
