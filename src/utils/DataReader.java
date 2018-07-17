package utils;

import data.Book;

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

    public Book readAndCreateBook() {
        System.out.println("Podaj tytuł książki: ");
        String tytul = sc.nextLine();
        System.out.println("Podaj autora książki: ");
        String autor = sc.nextLine();
        System.out.println("Podaj rok wydania książki: ");
        int rokWydania = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj ilość stron książki: ");
        int iloscStron = sc.nextInt();
        System.out.println("Podaj numer ISBN książki: ");
        int ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę wydawnictwa: ");
        String wydawnictwo = sc.nextLine();
        System.out.println("Podaj cenę książki: ");
        double cena = sc.nextDouble();

        return new Book(tytul, autor, wydawnictwo, ISBN, rokWydania, iloscStron, cena);
    }

    public void close() {
        sc.close();
    }
}
