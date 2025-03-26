package Library_Management_System.Model; // Package declaration, indicating the location of the class in the project

// The Book class represents a model/entity for a book in the Library Management System.
// It contains attributes related to a book and provides getter and setter methods
// to access and modify the books data.

public class Book {

	private String bookId; // Unique identifier for the book
	private String title; // RepresentsTitle of the book
	private String author; // Represents Author of the book
	private String genre; // Represents Genre of the book
	private String availability; // Represents Availability status

	// Parameterized Constructor
	public Book(String bookId, String title, String author, String genre, String availability) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availability = availability;
	}

	// Getter method to retrieve the book ID.
	public String getBookId() {
		return bookId;
	}

	// Setter method to update the book ID.
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

//    Getter method to retrieve the book title.
	public String getTitle() {
		return title;
	}

//Setter method to update the book title.
	public void setTitle(String title) {
		this.title = title;
	}

//Getter method to retrieve the book author.
	public String getAuthor() {
		return author;
	}

// Setter method to update the book author.
	public void setAuthor(String author) {
		this.author = author;
	}

//Getter method to retrieve the book genre.
	public String getGenre() {
		return genre;
	}

//Setter method to update the book genre.
	public void setGenre(String genre) {
		this.genre = genre;
	}

//Getter method to retrieve the availability status of the book.
	public String getAvailability() {
		return availability;
	}

//    Setter method to update the book availability status.
	public void setAvailability(String availability) {
		this.availability = availability;
	}

//This is useful for displaying book details in a readable format.
	@Override
	public String toString() {
		return "Book [ID=" + bookId + ", Title=" + title + ", Author=" + author + ", Genre=" + genre + ", Availability="
				+ availability + "]";
	}
}
