package day9;

import java.util.Scanner;

//Day9-Assignment 6

public class Table {
	
	public void printTable(int n) {
		
		for(int i=1; i<=10; i++) {
			int t=n*i;
			System.out.println(+n +"*" +i +"=" +t);
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		Table obj=new Table();
		System.out.println("Print Table");
		obj.printTable(n);
		
		
		
		
	}

}
