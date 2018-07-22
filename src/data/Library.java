package data;

public class Library {

    public static final int MAX_BOOKS = 1000;
    public static final int MAX_MAGAZINES = 1000;
    private Book[] books;
    private Magazine [] magazines;
    private int actualBooksCount;
    private int actualMagazinesCount;

    public Library() {
        books = new Book[MAX_BOOKS];
        magazines = new Magazine[MAX_MAGAZINES];
    }

    public int getActualBooksCount() {
        return actualBooksCount;
    }

    public int getActualMagazinesCount() {
        return actualMagazinesCount;
    }

    public Book[] getBooks() {
        return books;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public void addBook(Book book) {
        if (actualBooksCount < MAX_BOOKS) {
            books[actualBooksCount] = book;
            actualBooksCount++;
        } else {
            System.out.println("Nie ma już miejsca w bibliotece na nowe książki!");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (actualMagazinesCount < MAX_MAGAZINES) {
            magazines[actualMagazinesCount] = magazine;
            actualMagazinesCount++;
        } else {
            System.out.println("Nie ma już miejsca w bibliotece na nowe magazyny!");
        }
    }

    public void printMagazines() {
        if (actualMagazinesCount == 0) {
            System.out.println("W książce nie ma żadnej książki. Dodaj nową książkę");
        }
        for (int i = 0; i < actualMagazinesCount; i++) {
            magazines[i].printMagazineInfo();
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

