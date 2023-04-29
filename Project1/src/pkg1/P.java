package pkg1;

public class P {
	
	public static void main(String[] args) {
		String s="I am Rahul";
		String s1[]=s.split(" ");
		int l=s1.length;
		
		for(int i=0;i<l;i++)
		{
			String s2[]=s1[i].split("");
			int l2=s2.length;
			
		  for(int j=l2-1; j>=0;j--)
		  {
			System.out.print(s2[j]);
		
		
		  }
			System.out.print(" ");
		}
	}
}

	


