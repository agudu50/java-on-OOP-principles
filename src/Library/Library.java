package Library;



import java.util.ArrayList;
import java.util.Iterator;

class Library {
    private ArrayList<Book> books = new ArrayList();
    private ArrayList<Member> members = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void registerMember(Member member) {
        this.members.add(member);
    }

    public Book searchBookByTitle(String title) {
        Iterator var2 = this.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                throw new IllegalArgumentException("Book not found");
            }

            book = (Book)var2.next();
        } while(!book.getTitle().equalsIgnoreCase(title));

        return book;
    }

    public void displayBooks() {
        Iterator var1 = this.books.iterator();

        while(var1.hasNext()) {
            Book book = (Book)var1.next();
            System.out.println(book);
        }

    }
}
