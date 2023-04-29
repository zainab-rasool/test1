package day9;

import java.util.Scanner;

//Day9-Assignment 7
public class Factorial {
	
	public void factorialNumber(int n) {
		int f=1;
		for(int i=n; i>0; i--) {
			
			f=f*i;	
		}
		System.out.println(+f);
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		Factorial obj=new Factorial();
		obj.factorialNumber(n);
		
	}

}
