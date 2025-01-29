package Library;

import java.util.ArrayList;

class Member {
    private String memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Methods
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            throw new IllegalArgumentException("Book already borrowed by this member");
        }
        book.borrowBook();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            throw new IllegalArgumentException("This book was not borrowed by the member");
        }
    }

    @Override
    public String toString() {
        return String.format("Member [ID: %s, Name: %s, Borrowed Books: %d]", memberId, name, borrowedBooks.size());
    }
}


