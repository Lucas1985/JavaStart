package data;

import java.util.Scanner;

public class Book {

    private String tytul;

    private String autor;
    private String wydawnictwo;
    private int ISBN;
    private int rokWydania;
    private int iloscStron;
    private double cena;

    public Book(String tytul, String autor, String wydawnictwo, int ISBN, int rokWydania, int iloscStron, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.ISBN = ISBN;
        this.rokWydania = rokWydania;
        this.iloscStron = iloscStron;
        this.cena = cena;
    }

    public Book(Book book) {
        this(book.getTytul(), book.getAutor(), book.getWydawnictwo(), book
            .getISBN(), book.getRokWydania(), book.getIloscStron(), book.getCena());
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void printBookInfo() {
        String info = "Tytuł: " + getTytul() + " Autor: " + getAutor() + " Wydawnictwo: " + getWydawnictwo() +
                " ISBN: " + getISBN() + " Rok wydania: " + getRokWydania() + " Ilość stron: " + getIloscStron() + " Cena: " + getCena();
        System.out.println(info);
    }
}
