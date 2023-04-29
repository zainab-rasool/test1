package pkg1;

import java.util.Scanner;

//Day5-(Assignment 1)
public class AssignmentExpression1 extends ArithmeticMethod{
	
	public static void main(String[] args) {
		//Using Inheritance and IS A relationship
		
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter value of x1");
		int x1=ref.nextInt();
		
		System.out.println("Enter value of x2");
		int x2=ref.nextInt(); 
		
		AssignmentExpression1 obj=new AssignmentExpression1();
		int result1=obj.add(x1, x2);
		
		System.out.println("Enter value of x3");
		int x3=ref.nextInt(); 
		int result2=obj.add(result1, x3);
		
		System.out.println("Enter value of x4");
		int x4=ref.nextInt(); 
		
		int result3=obj.sub(result2, x4);
		
		System.out.println("Enter value of x5");
		int x5=ref.nextInt(); 
		
		int result4=obj.divide(result3, x5);
		
		System.out.println("Enter value of x6");
		int x6=ref.nextInt(); 
		
		int result5=obj.multiply(result4, x6);
		
		System.out.println("((((x1+x2)+x3)-x4)/x5)*x6) = " +result5);
		
		
		
	}

}
