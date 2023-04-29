package pkg11;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		int a[]= {12,35,1,10,34,1};
		ArrayList<Integer> list = new ArrayList<Integer>(); // works fine  
		System.out.println("Enter array value");
		Scanner s=new Scanner(System.in);
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		
		 /*for(Integer fruit:list)    
			    System.out.println(fruit);    
			  
			 } */ 
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	for(Integer element:list) { 
		
		if(!list2.contains(element)) {
		
		list2.add(element);
		}
	      
	  
	 }
	for(Integer fruit:list2) {   
	    System.out.println("list2==" +fruit);    
	  
	 } 
	
	
	
	}
}



