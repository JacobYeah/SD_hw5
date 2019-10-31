package hw5_Inheritance_Polymorphism;

public class Librarian extends Users {

	public Librarian(int id, String name) {
		super(id,name);
		System.out.println("I am a Librarian");
		// TODO Auto-generated constructor stub
	}
	public void printName() {
		
		System.out.println("I am a Librarian !!!!");
	}
	public static void main(String args[]) {
		Users usr4 = new Users(1, "lllalalalla");
		Users usr3 = new Librarian(1,"hhhhhhhhhhhhhh");
		Librarian usr1 =  new Librarian(1, "Jacob1");
		System.out.println(usr1.getName());
		
		usr4.printName();
		usr3.printName();
	}

}
