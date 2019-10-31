package HW5_1;


public class Student {
	
	private String name;
	private String phone;
	private String address;
	private String department;
	private int id;
	private int age;
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	 String  getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printStudentnfo(Student Student) {
		System.out.println("Name : " + Student.getName() );
		//System.out.println("\n");
		System.out.println("Id:" + Student.getId());
		//System.out.println("\n");
		System.out.println("Age:"+ Student.getAge());
		//System.out.println("\n");
		System.out.println("Phone:" + Student.getPhone());
		//System.out.println("\n");
		System.out.println("Address:" + Student.getAddress());
		//System.out.println("\n");
		System.out.println("Department:" + Student.getDepartment());
		//System.out.println("\n");
	}

	public static void main(String args[]) {
		Student Jacob = new Student(661990887, "Chen Wang");
		Jacob.setAge(22);
		Jacob.setAddress("2419 21st Street");
		Jacob.setPhone("5189612127");
		Jacob.setDepartment("ITWS");
		Jacob.printStudentnfo(Jacob);
		
	}

}
