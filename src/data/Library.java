package data;

public class Library {

    public final int MAX_BOOKS = 1000;
    private Book[] books;
    private int actualBooksCount = 0;

    public Library() {
        books = new Book[MAX_BOOKS];
    }

    public int getActualBooksCount() {
        return actualBooksCount;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (actualBooksCount < MAX_BOOKS) {
            books[actualBooksCount] = book;
            actualBooksCount++;
        } else {
            System.out.println("Nie ma już miejsca w bibliotece na nowe książki!");
        }
    }

    public void printBooks() {
        if (actualBooksCount == 0) {
            System.out.println("W książce nie ma żadnej książki. Dodaj nową książkę");
        }
        for (int i = 0; i < actualBooksCount; i++) {
            books[i].printBookInfo();
        }
    }
}

