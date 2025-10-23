package Book;

public class BookMain {
    public static void main(String[] args) {
       
        Book book1 = new Book("Why Plato Matters", "Angie Hobbs", "9780743273565");
        Book book2 = new Book("Marx", "Brian Leiter & Jaime Edwards", "9780060935467");
        Book book3 = new Book("What Does it all MEan?", "Thomas Nagel", "9780451524935");

      
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        Book.displayAllBooks();


        Book.removeBook("9780060935467");

    
        Book.displayAllBooks();
    }
}
