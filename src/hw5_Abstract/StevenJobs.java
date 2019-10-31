package hw5_Abstract;

public class StevenJobs extends BookInfo{
	
	public StevenJobs(String name) {
		super(name);
		System.out.println("This is a book called Steven Jobs");
	}
	
	public void removeBook() {
		System.out.println(getISBN());
		System.out.println("Remove Steven Jobs successfully!!!");
	}
	
	public static void main(String arg[]){
		StevenJobs sj1 =  new StevenJobs("SJ");
		sj1.setISBN("1232431321");
		sj1.removeBook();
	}

}
