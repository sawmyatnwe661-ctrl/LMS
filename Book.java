package mypack3;

public class Book {
	int id;
	String title;
	String author;
	boolean available;
	public  Book(int i,String t,String a) {
		id=i;
		title=t;
		author=a;
		available=true;
	}
	public void ShowInfo() {
		System.out.println("==========Book Information========");
		System.out.println("Book ID: "+id);
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("Available:" +(available?"Yes":"No"));
	}
	

}
