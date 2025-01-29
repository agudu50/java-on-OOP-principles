package Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("B001", "Animal Farm", "George Orwell", 3);
        Book book2 = new Book("B002", "1984", "George Orwell", 2);
        Book book3 = new Book("B003", "Harry Porter", "J.K Rowling", 1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Member member1 = new Member("M001", "Anthony Gudu");
        library.registerMember(member1);
        System.out.println("Available Books:");
        library.displayBooks();

        try {
            member1.borrowBook(book1);
            System.out.println("\nAfter borrowing 'Animal Farm' \n Available Books are :");
            library.displayBooks();
            member1.returnBook(book1);
            System.out.println("\nAfter returning 'Animal Farm':");
            library.displayBooks();
        } catch (IllegalArgumentException var7) {
            System.out.println(var7.getMessage());
        }

    }
}

