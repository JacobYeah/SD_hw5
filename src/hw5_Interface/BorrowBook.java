package hw5_Interface;

public class BorrowBook implements OperateBook {
	
	public void returnBook(){
		System.out.println("Return Successfully");
	}
	public void borrowBook() {
		System.out.println("Borrow Successfully");
	}
	
	public static void main(String arg[]) {
		
		BorrowBook BB = new BorrowBook();
		BB.returnBook();
		BB.borrowBook();
		
	}

}
