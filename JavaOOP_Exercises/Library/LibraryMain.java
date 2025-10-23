package Library;

public class LibraryMain {
     public static void main(String[] args) {
       
        Library book1 = new Library("Why Plato Matters", "Angie Hobbs", "9780743273565");
        Library book2 = new Library("Marx", "Brian Leiter & Jaime Edwards", "9780060935467");
        Library book3 = new Library("What Does it all MEan?", "Thomas Nagel", "9780451524935");

      
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);

        Library.displayAllBooks();


        Library.removeBook("9780060935467");

    
        Library.displayAllBooks();
    }
}
