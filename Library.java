import java.util.ArrayList;

public class Library {

    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Borrower> borrowers = new ArrayList<>();

    public void addBook(Book book1) {
        books.add(book1);
        System.out.println("Book added to library: " + book1.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book1) {
        if(books.contains(book1)) {
            books.remove(book1);
            borrower.borrowBook(book1);
            System.out.println(borrower.getName() + " borrowed: " + book1.getTitle());
        }
    }

    public void returnBook(Borrower borrower, Book book1) {
        borrower.returnBook(book1);
        books.add(book1);
        System.out.println(borrower.getName() +" returned: "+ book1.getTitle());
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        for (Book book: books) {
            book.displaybook();
        }
    }

}
