package Library;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int availableCopies;

    public Book(String bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.setAvailableCopies(availableCopies);
    }

    public String getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getAvailableCopies() {
        return this.availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        if (availableCopies < 0) {
            throw new IllegalArgumentException("Available copies cannot be negative");
        } else {
            this.availableCopies = availableCopies;
        }
    }

    public void borrowBook() {
        if (this.availableCopies > 0) {
            --this.availableCopies;
        } else {
            throw new IllegalArgumentException("No copies available to borrow");
        }
    }

    public void returnBook() {
        ++this.availableCopies;
    }

    public String toString() {
        return String.format("Book [ID: %s, Title: %s, Author: %s, Available Copies: %d]", this.bookId, this.title, this.author, this.availableCopies);
    }
}

