package week1.day3;

public class Library {
	
String booktitle;
	
	public String addBook(String booktitle)
	{
		System.out.println("Book added successfully :"+ booktitle);
		return booktitle;
		
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library lb=new Library();
		lb.addBook("You Can Win");
		lb.issueBook();

	}

}
