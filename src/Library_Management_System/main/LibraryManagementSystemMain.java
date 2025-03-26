package Library_Management_System.main;
import java.util.Scanner;

import Library_Management_System.Service.BookService;

public class LibraryManagementSystemMain {
	
		public static void main(String[] args) {
			
			BookService service=new BookService();
			Scanner scanner=new Scanner(System.in);
			
			while(true) {
				System.out.println("\n--- Digital Library Management System ---");
				System.out.println("1.Add Book");
				System.out.println("2.View All Books");
				System.out.println("3. Search Book");
	            System.out.println("4. Update Book Details");
	            System.out.println("5. Delete Book");
	            System.out.println("6. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice=scanner.nextInt();
	            
	            
	            switch (choice) {
                case 1:
                	
                	service.addBook();
                    break;
                case 2:
                 service.displayBooks();
                    break;
                case 3:
                   service.searchBook();
                    break;
                case 4:
                  service.updateBook();
                    break;
                case 5:
                   service.deleteBook();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
			
		}
	
}
