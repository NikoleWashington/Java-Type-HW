import java.util.ArrayList;
import java.util.List;

public class Library {
	
	String libraryAddress;
	boolean returnBook;
	
	
	
	
	public Library(String address) {
		this.libraryAddress = address;
	}
	
	
	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		this.books.add(book);
		
	}
	
	public static void printOpeningHours() {
    	System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void printAddress() {
		 System.out.println(libraryAddress);
	}
	
	private void returnBook(String bookTitle) {
		for(Book theBook: this.books) {
			if (bookTitle.equals(theBook.getTitle())) {
				theBook.returned();
				System.out.println("You have successfully returned " + bookTitle);
			}
		}
		
	}

	private void printAvailableBooks() {
		for(Book theBook : this.books) {
		if(!theBook.isBorrowed()) {
			System.out.println(theBook.getTitle());
		}
	} if(this.books.isEmpty()) {
		System.out.println("Sorry, we don't have any books today");
		
	}
	
	
	}

	public void borrowBook(String bookTitle) {
		for(Book theBook : this.books) {
			if(bookTitle.equals(theBook.getTitle())) {
				System.out.println(theBook.isBorrowed());
				if(!theBook.isBorrowed()) {
					theBook.borrowed();
					System.out.println("You have successfully borrowed the book. Please return " + bookTitle + " in one week");
				}
				  else{
				
				System.out.println("Sorry, " + bookTitle + " has been borrowed already");
			}
				
		
			}
		
		}
		
	}

	public static void main(String[] args) {
		// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        
        
        
        

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        
        
        

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

	}



	

}
