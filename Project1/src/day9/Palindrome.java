package day9;

import java.util.Scanner;

////Day9-Assignment 4
public class Palindrome {
	
	public void palindromeNumber(int n) {
		int r,s=0, temp=n;
		while(n>0) {
			r=n%10; 
			s=s*10+r; 	
			n=n/10;
		}
		if(temp==s){
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		Palindrome obj=new Palindrome();
		obj.palindromeNumber(n);
		
	}

}
