package pkg11;
import java.util.Scanner;

public class Example1Array {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[];
		
		System.out.println("Enter the size of list");
		int size=s.nextInt();
		a=new int[size];
		
		System.out.println("Enter array value");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			//System.out.println(+a[i]);
		}
		int c=0;
		for(int j=0;j<size;j++) {
			if(a[j]%2==0) {
				c++;
			}
		}
		
		System.out.println("count = "+c);
	}
}
