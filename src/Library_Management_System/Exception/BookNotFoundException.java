package Library_Management_System.Exception;


 // Custom exception class for handling book not found scenarios.
// Extends RuntimeException.
 
public class BookNotFoundException extends RuntimeException {

    // Constructor to create a BookNotFoundException with a custom message.
     
    public BookNotFoundException(String message) {
        super(message);
    }
}
