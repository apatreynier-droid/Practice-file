package Library;

import java.util.ArrayList;

public class Library {
    private String title;
    private String author;
    private String isbn;

    
    public Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    
    private static ArrayList<Library> collection = new ArrayList<>();

    
    public static void addBook(Library book) {
        collection.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    
    public static void removeBook(String isbn) {
        boolean removed = false;
        for (Library book : collection) {
            if (book.getIsbn().equals(isbn)) {
                collection.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    
    public static void displayAllBooks() {
        System.out.println("\n--- Book Collection ---");
        if (collection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Library book : collection) {
                book.displayInfo();
            }
        }
    }
}
