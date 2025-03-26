# 📚 Library Management System

## 🚀 Description
A **Library Management System** built using **Java**, designed to perform CRUD operations on books.  
It allows users to:
- Add, update, delete, search, and display books.  
- Use **custom exception handling** for missing books (`BookNotFoundException`).  
- Store books in memory using `ArrayList`.  
- Modular structure with packages for better organization.  

---

## 🛠️ Technologies Used
- **Java** (JDK 17+)
- **ArrayList** for data storage
- **Scanner** for user input
- **Custom Exceptions** (`BookNotFoundException`)
- **GitHub** for version control
- **Docker** for deployment
- **Modular Structure**:
  - `Model` → Contains the `Book` entity class.
  - `Service` → Contains the business logic and CRUD operations.
  - `Exception` → Contains the custom exception handling class.

---

## 🔥 Features
✅ **Add Book:**  
- Add a new book with:  
  - ID, Title, Author, Genre, and Availability.  
- Duplicate IDs are **not allowed**.  

✅ **Display Books:**  
- View all books with their details.  
- Display a message if no books are available.  

✅ **Search Book:**  
- Search by **Book ID** or **Title**.  
- Display the book if found, or show an error message.  

✅ **Update Book:**  
- Update the title, author, and availability status.  
- Keep the previous data if you leave fields blank.  

✅ **Delete Book:**  
- Remove a book by ID.  
- Display a message if the book is not found.  

✅ **Exception Handling:**  
- Handle missing books with `BookNotFoundException`.  
- Display meaningful error messages.  

✅ **Docker Deployment:**  
- Easily deployable using Docker.  

---

## 📁 Project Structure

 Library_Management_System ┣ 📂 src ┃ ┣ 📂 Library_Management_System ┃ ┃ ┣ 📂 Exception # Custom exception handling class ┃ ┃ ┃ ┗ 📜 BookNotFoundException.java ┃ ┃ 
 ┣ 📂 Model # Book entity class ┃ ┃ ┃ ┗ 📜 Book.java ┃ ┃ ┣ 📂 Service # Book operations class ┃ ┃ ┃ ┗ 📜 BookService.java ┃ ┃ ┣ 📂 Main # Main entry point of the application
 ┃ ┃ ┃ ┗ 📜 LibraryManagementApp.java ┣ 📜 README.md # Project description and instructions ┣ 📜 .gitignore # Ignore compiled files



##  Challenges Faced During Development
1>Exception Handling Complexity:
One of the main challenges was implementing custom exception handling.
To gracefully handle missing books, a BookNotFoundException was created.
This improved error reporting and made the application more robust.

## Data Validation Issues:
Ensuring valid data entry was tricky.
Implemented validation checks to prevent:
Empty titles
Missing author names
Invalid availability status
## Modular Code Structure:
Dividing the code into packages improved readability and maintainability.

## Separate classes for:
Book entity
CRUD operations
Exception handling

