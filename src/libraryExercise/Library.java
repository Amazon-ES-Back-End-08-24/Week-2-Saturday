package libraryExercise;

public class Library {
    private Book book; // una clase puede tener otras clases como atributos (como String, que es una clase)

    public void addBook(Book book) {
        if (this.book == null) {
            this.book = book;
            System.out.println("Book added to the library: " + book.getTitle());
        } else {
            System.out.println("A book is already in the library. Remove the current book before adding a new one.");
        }
    }

    public void removeBook() {
        if (this.book != null) {
            System.out.println("Book removed from the library: " + book.getTitle());
            this.book = null;
        } else {
            System.out.println("No book in the library to remove.");
        }
    }

    public void displayBook() {
        if (this.book != null) {
            System.out.println("Book in the library: " + book);
        } else {
            System.out.println("No book in the library.");
        }
    }

    public void borrowBook() {
        if (this.book != null) {
            book.borrowBook();
        } else {
            System.out.println("No book in the library to borrow.");
        }
    }

    public void returnBook() {
        if (this.book != null) {
            book.returnBook();
        } else {
            System.out.println("No book in the library to return.");
        }
    }
}
