package day7;

public class ChildAssignment2 extends ParentAss2{
	public void methodc1() {
		this.methodc3(3, 6);
		System.out.println("Child Default method");
	}
 
	public void methodc2(int a) {
		System.out.println("Child 1 parameterized method");
	}
	
	public void methodc3(int a, int b) {
		super.method4(2, 3, 5);
		System.out.println("Child 2 parameterized method");
	}

	public void method4(int a, int b, int c) {
		this.methodc1();
		this.methodc2(2);
		System.out.println("Child 3 parameterized method");
	}

  public static void main(String[] args) {
	  ChildAssignment2 obj=new ChildAssignment2();
	  obj.method4(2, 4, 6);
}
}
