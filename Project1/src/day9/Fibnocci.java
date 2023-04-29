package day9;

import java.util.Scanner;
//Day9-Assignment 8
public class Fibnocci {
	
	public void fibonocci_series() {
		int a=0, b=1,c;
		System.out.print(+a);
		System.out.print(" ");
		System.out.print(+b);
		for(int i=0;i<10;i++) {
			c=a+b;
			System.out.print(" ");
			System.out.print(+c);
			System.out.print(" ");
			a=b;
			b=c;
			
		}
		
		
	}
	
	public static void main(String[] args) {
	Fibnocci obj=new Fibnocci();
	System.out.println("Fibonocci Series");
	obj.fibonocci_series();
		
	}

}
