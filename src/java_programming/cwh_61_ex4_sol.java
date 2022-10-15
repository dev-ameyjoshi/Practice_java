package java_programming;


class library {
    String[] books;
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String books) {
        this.books[no_of_books] = books;    //To Store the book in index : 0 then 1 and so on....
        no_of_books++;
        System.out.println(books + " book has been added!");//To increment to next position in the index
    }

    void showAvaiableBooks() {
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if (book == null) {
                continue;
                //To skip the book that has been issued and not the rest of the books.
                //Basically to avoid skipping the rest of the values because of just one null value
                //Hence break --> continue.

            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {

                System.out.println("The Book has been issued.");
                this.books[i] = null;
                return;
            }


        }
        System.out.println("This Book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}
public class cwh_61_ex4_sol {
    public static void main(String[] args) {
       library centralLibrary = new library();
       centralLibrary.addBook("Think And Grow Rich");
       centralLibrary.addBook("Atomic Habits");
       centralLibrary.addBook("Algorithms");
       centralLibrary.showAvaiableBooks();
       centralLibrary.issueBook("Atomic Habits");
       centralLibrary.showAvaiableBooks();
       centralLibrary.returnBook("Atomic Habits");
       centralLibrary.showAvaiableBooks();

    }
}
