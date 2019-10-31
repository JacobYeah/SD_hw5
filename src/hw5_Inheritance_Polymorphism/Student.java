package hw5_Inheritance_Polymorphism;

public class Student extends Users {
	public Student(int id, String name) {
		super(id, name);
		System.out.println("I am a student");
	}
	
	public void newMethod() {
		System.out.println("There is a function that parent don't have!");
	}
	
	public static void main(String args[]) {
		Student usr2 =  new Student(1, "Jacob2");
		System.out.println(usr2.getId());
		usr2.newMethod();
		usr2.toString();
	}
}
