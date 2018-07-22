package app;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;

public class LibraryControl {
    public static final int EXIT = 0;
    public static final int ADD_BOOK = 1;
    public static final int PRINT_BOOKS = 2;
    public static final int ADD_MAGAZINE = 3;
    public static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader;

    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 aby wyjść z programu: ");
        System.out.println("1 aby dodać ksiżąkę");
        System.out.println("2 aby wydrukować wszystkie książki dostępne w bibliotece");
        System.out.println("3 aby dodać magazyn");
        System.out.println("4 aby wydrukować wszystkie magazyny dostępne w bibliotece");
    }

    public void appControl(){
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
        dataReader.close();
    }
}
