package libraryExercise;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The book has been borrowed.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }


    // el método toString está definido en la clase Object que es la superclass de todas las clases
    // todas las clases heredan de ella y si queremos modificar el toString() por defecto lo sobreescribimos -> Override

    // si no lo pongo al hacer un SOUT de book me saldrá su dirección en memoria, no sus atributos
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + (isBorrowed ? " (Borrowed)" : "");
    }
}

