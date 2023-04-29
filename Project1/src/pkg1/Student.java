package pkg1;

//Day1(Assignment 1)
public class Student {
	
	int age, roll_no;
	
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.display1();
		obj.display2();
		obj.age=25;
		System.out.println(obj.age);
		obj.roll_no=99;
		System.out.println(obj.roll_no);
	}

}
