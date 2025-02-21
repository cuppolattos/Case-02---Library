
public class Book {

    String title;
    String ISBN;
    Author author;

    public Book(String title, String ISBN, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public void displaybook() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author.getauthor());
        System.out.println("Biography: " + author.getbio());
        System.out.println("------------------------");
    }

    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public Author getAuthor() {
        return author;
    }
}
