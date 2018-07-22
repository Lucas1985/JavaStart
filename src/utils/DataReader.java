package utils;

import data.Book;
import data.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public void close() {
        sc.close();
    }

    public Book readAndCreateBook() {
        System.out.println("Podaj tytuł książki: ");
        String title = sc.nextLine();
        System.out.println("Podaj autora książki: ");
        String author = sc.nextLine();
        System.out.println("Podaj rok wydania książki: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj ilość stron książki: ");
        int pages = sc.nextInt();
        System.out.println("Podaj numer ISBN książki: ");
        int ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę wydawnictwa: ");
        String publisher = sc.nextLine();
        System.out.println("Podaj cenę książki: ");

        return new Book(title, author, year, ISBN, publisher, pages);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Podaj tytuł magazynu: ");
        String title = sc.nextLine();
        System.out.println("Podaj rok wydania magazynu: ");
        int year = sc.nextInt();
        System.out.println("Podaj miesiąc wydania magazynu: ");
        int month = sc.nextInt();
        System.out.println("Podaj dzień wydania magazynu: ");
        int day = sc.nextInt();
        System.out.println("Podaj nazwę wydawnictwa: ");
        String publisher = sc.nextLine();
        System.out.println("Podaj język magazynu: ");
        String language = sc.nextLine();

        return new Magazine(title, publisher, language, year, month, day);
    }
}
