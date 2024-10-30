package s1t4level1.l1ex1.src;

import java.util.*;

public class Library {
    private Set<Book> booksCollection = new TreeSet<>();

    public Library() {}

    public Library(HashSet<Book> booksCollection) {
        this.booksCollection = booksCollection;
    }

    public void addBook(String title) {
        booksCollection.add(new Book(title));
    }

    public void addBookByIndex(String title, int index) {
        List<Book> booksList = new ArrayList<>(booksCollection);

        if (index < 0 || index > booksList.size()) {
            System.out.println("Index out of range.");
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        booksList.add(index, new Book(title));
        booksCollection = new TreeSet<>(booksList);

        System.out.println(booksCollection);
    }

    public void getBooksCollection() {
        System.out.println(booksCollection.toString());
    }

    public void getBookByIndex(int index) {
        List<Book> books = new ArrayList<>(booksCollection);
        Book book = books.get(index);
        System.out.println(book.toString());
    }

    public void removeBookByTitle(String title) {
        booksCollection.remove(new Book(title));
        System.out.println(booksCollection.toString());
    }

    @Override
    public String toString() {
        StringBuilder booksCollectionList = new StringBuilder();
        for (Book book : booksCollection) {
            booksCollectionList.append(book.getTitle()).append("\n");
        }

        return booksCollectionList.toString();
    }

}
