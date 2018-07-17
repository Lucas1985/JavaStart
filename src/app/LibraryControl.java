package app;

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControl {
    public final int EXIT = 0;
    public final int ADD_BOOK = 1;
    public final int PRINT_BOOKS = 2;

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

    private void printBooks() {
        library.printBooks();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 aby wyjść z programu: ");
        System.out.println("1 aby dodać ksiżąkę");
        System.out.println("2 aby wydrukować wszystkie książki dostępne w bibliotece");
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
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
        dataReader.close();
    }
}
