package app;

public class LibraryApp {

    public static final String APP_NAME = "Biblioteka v0.9";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.appControl();
    }
}
