package day9;

import java.util.Scanner;

////Day9-Assignment 5
public class Armstrong {
	
	public void armstrongNumber(int n) {
		int r,temp=n,s=0;
		while(n>0) {  
			r=n%10;   
			s=s+r*r*r;  
			n=n/10; 
		}
		
		if(temp==s) {
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		Armstrong obj=new Armstrong();
		obj.armstrongNumber(n);
		
	}

}
