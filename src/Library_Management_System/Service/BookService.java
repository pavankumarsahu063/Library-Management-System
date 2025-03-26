package Library_Management_System.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Library_Management_System.Exception.BookNotFoundException;
import Library_Management_System.Model.Book;


// Service class for managing book-related operations.

public class BookService {

    // List to store book objects
    List<Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

//     Helper method to check for duplicate book IDs.bookId The book ID to check for duplicates. return true if the ID already exists, false otherwise.
    private boolean isDuplicateId(String bookId) {
        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }

   //Method for Adding New Book To The List.After adding book details it will print a meassage 
    public void addBook() {
        try {
            System.out.println("Enter Book ID: ");
            String bookId = scanner.nextLine().trim();

            if (isDuplicateId(bookId)) {
                System.out.println("Book already exists. Try again.");
                return;
            }

            System.out.println("Enter Title: ");
            String title = scanner.nextLine().trim();
            if (title.isEmpty()) {
                throw new IllegalArgumentException("Title cannot be empty.");
            }

            System.out.print("Enter Author: ");
            String author = scanner.nextLine().trim();
            if (author.isEmpty()) {
                throw new IllegalArgumentException("Author cannot be empty.");
            }

            System.out.print("Enter Genre: ");
            String genre = scanner.nextLine().trim();

            System.out.print("Enter Availability (Available / Checked Out): ");
            String availability = scanner.nextLine().trim();

            if (!availability.equalsIgnoreCase("Available") && !availability.equalsIgnoreCase("Checked Out")) {
                throw new IllegalArgumentException("Invalid availability status.");
            }

            // Here Im Creating a book Oject. The object im going to add in list
            Book newBook = new Book(bookId, title, author, genre, availability);
            //	Here I added The Object Into lIST
            bookList.add(newBook);
            System.out.println("Book added successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method To Display All The Books.
    // If The books Present it will display.Other wise it throw meassage  No books are available.
    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books are available.");
            return;
        }
        System.out.println("\nBook List:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    /**
     * Searches for a book by ID or title with exception handling.
     */
    public void searchBook() {
        System.out.println("Enter Book ID or Title to search: ");
        String searchQuery = scanner.nextLine().trim();

        boolean isFound = false;

        try {
            for (Book book : bookList) {
                if (book.getBookId().equalsIgnoreCase(searchQuery) || book.getTitle().equalsIgnoreCase(searchQuery)) {
                    System.out.println("Book Found: " + book);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                throw new BookNotFoundException("Book not found with ID or Title: " + searchQuery);
            }

        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Updates a book's details by ID with exception handling.
     */
    public void updateBook() {
        System.out.println("Enter Book ID to update: ");
        String bookId = scanner.nextLine().trim();

        boolean bookFound = false;

        try {
            for (Book book : bookList) {
                if (book.getBookId().equalsIgnoreCase(bookId)) {
                    System.out.print("Enter new title (leave blank to keep unchanged): ");
                    String newTitle = scanner.nextLine().trim();
                    if (!newTitle.isEmpty()) {
                        book.setTitle(newTitle);
                    }

                    System.out.print("Enter new author (leave blank to keep unchanged): ");
                    String newAuthor = scanner.nextLine().trim();
                    if (!newAuthor.isEmpty()) {
                        book.setAuthor(newAuthor);
                    }

                    System.out.print("Enter new availability (Available / Checked Out): ");
                    String newStatus = scanner.nextLine().trim();
                    if (!newStatus.isEmpty()) {
                        book.setAvailability(newStatus);
                    }

                    System.out.println("Book updated successfully.");
                    bookFound = true;
                    return;
                }
            }

            if (!bookFound) {
            	//If Book is not present It will throw booknotfoundexception 
                throw new BookNotFoundException("Book ID not found: " + bookId);
            }

        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    /**
     * Deletes a book by ID with exception handling.
     */
    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookId = scanner.nextLine().trim();

        boolean bookFound = false;

        ListIterator<Book> iterator = bookList.listIterator();

        try {
            while (iterator.hasNext()) {
                Book book = iterator.next();

                if (book.getBookId().equalsIgnoreCase(bookId)) {
                    iterator.remove();
                    System.out.println("Book with ID '" + bookId + "' has been deleted.");
                    bookFound = true;
                    break;
                }
            }

            if (!bookFound) {
            	//If Book is not present It will throw booknotfoundexception 
                throw new BookNotFoundException("Book with ID '" + bookId + "' not found.");
            }

        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
