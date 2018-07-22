package data;

public class Book extends Publication {

    private String author;
    private int ISBN;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public Book(String title, String author, int year, int pages, String publisher, int ISBN) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setPages(pages);
        this.setPublisher(publisher);
        this.setISBN(ISBN);
    }


    public void printBookInfo() {
        String info = "Tytuł: " + getTitle() + " Autor: " + getAuthor() + " Wydawnictwo: " + getPublisher() +
                " ISBN: " + getISBN() + " Rok wydania: " + getYear() + " Ilość stron: " + getPages() + " Cena: ";
        System.out.println(info);
    }
}
