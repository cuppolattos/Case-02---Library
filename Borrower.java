import java.util.ArrayList;

public class Borrower {

    public String name;
    private ArrayList<Book> borrowedList = new ArrayList();

    public Borrower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedList.add(book);
    }

    public void returnBook(Book book) {
        borrowedList.remove(book);
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed Books:");
        for(Book book: borrowedList) {
            book.displaybook();
        }
    }

}
