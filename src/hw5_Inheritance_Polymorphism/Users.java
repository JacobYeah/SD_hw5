package hw5_Inheritance_Polymorphism;

public class Users {
	public String name;
	public int id;
	public int authority;
	
	public Users(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}
	
	
	public void printName() {
		System.out.println("I am a customer!");
	}
}
