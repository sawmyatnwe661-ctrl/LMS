package mypack3;
import java.util.*;
public class LMS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book[]mybook=new Book[100];
		int count=0;
		while (true) {
			System.out.println("========Library Management System=========");
			System.out.println("1.Add New Book ");
			System.out.println("2.Show All Books ");
			System.out.println("3.Search Book ");
			System.out.println("4.Borrow Book ");
			System.out.println("5.Return Book ");
			System.out.println("6.Exit ");
			System.out.println("Enter Your Choice: ");
			int choice=s.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter  New Book ID: ");
			int id=s.nextInt();
			System.out.println("Enter New Book Title: ");
			String title=s.next();
			System.out.println("Enter New Book Author: ");
			String author=s.next();
			mybook[count++]=new Book(id,title,author);
			System.out.println("\n=====Book added Successfully!=======");
			       break;
			case 2:System.out.println("=======All Books in Library========");
			for (int i=0;i<count;i++) {
				mybook[i].ShowInfo();
			}
			       break;
			case 3:System.out.println(" Enter Search Book Title ");
			String search_title=s.next();
			boolean found=false;
			for (int i=0;i<count;i++) {
				if(mybook[i].title.equalsIgnoreCase(search_title)) {
					found=true;
					System.out.println(search_title+" is Found!");
				}
			}
			if(!found) {
				System.out.println(search_title+" is not Found!");

			}
			break;
			case 4:System.out.println("Enter Borrow Book ID ");
			int search_id=s.nextInt();
			boolean borrow_found=false;
			for (int i=0;i<count;i++) {
				if(mybook[i].id==search_id) {
					borrow_found=true;
					if (mybook[i].available) {
						mybook[i].available=false;
						System.out.println("Book Borrow Successful!");
					}
					else {
						System.out.println("Book is already borrowed!");
					}
				}
			}
			if(!borrow_found) {
				System.out.println("Book is not found!");
			}
			break;
			case 5:System.out.println(" Enter Return Book ID ");
			int return_id =s.nextInt();
			boolean return_found=false;
			for (int i=0;i<count;i++) {
				if(mybook[i].id==return_id) {
					return_found=true;
					if(!mybook[i].available) {
						mybook[i].available=true;
						System.out.println(" Book Return Successful!");
			}
					else {
						System.out.println("Book is not borrowed!");
					}
				}
			}
			if(!return_found) {
				System.out.println("Book is not found in Library!");
			}
			break;
			case 6:System.out.println("Exit from System ");
			System.exit(0);
			default:System.out.println("Invalid menu");
			}
		}
		
	}

}
