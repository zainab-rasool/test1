package day9;

import java.util.Scanner;
//Day9-Assignment 3
public class PrimeNo {
	
	public void primeNumber(int n) {
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
				
				c++;
				
			}
			
		}
		
		if(c==0) {
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=s.nextInt();
		PrimeNo obj=new PrimeNo();
		obj.primeNumber(n);
		
		
		
	}

}
