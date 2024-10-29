package s1t4level1.l1ex1.src;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Caperucita");
        library.addBook("Aladin");
        library.addBook("El principito");


        library.getBooksCollection();
        library.getBookByIndex(1);
        library.addBookByIndex("Heidi", 0);
        library.removeBookByTitle("Heidi");

    }
}