package s1t4level1.l1ex1.test;


import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import s1t4level1.l1ex1.src.Library;


public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        Assertions.assertNotNull(library);

        library.addBook("Caperucita");
        library.addBook("Aladin");
    }

    @Test
    public void addBook() {
        String[] books = library.toString().split("\n");
        assertEquals(2, books.length);
        assertEquals("Aladin", books[0]);
        assertEquals("Caperucita", books[1]);
    }

    @Test
    public void addBookByIndex() {
        // This requirement is not clear as the list must be sorted
        // so this method has no sense since the index position is not the final position

        // Test for an out-of-bounds index
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            library.addBookByIndex("El patito feo", 5);
        });
        assertEquals("Index out of range.", exception.getMessage());


        String[] books = library.toString().split("\n");
        assertEquals(2, books.length);
        assertEquals("Aladin", books[0]);
        assertEquals("Caperucita", books[1]);

        // Attempting to add at a within-of-range index
        library.addBookByIndex("El patito feo",1);
        books = library.toString().split("\n");
        assertEquals(3, books.length);
        assertEquals("Aladin", books[0]);
        assertEquals("Caperucita", books[1]);
        assertEquals("El patito feo", books[2]);
    }

    @Test
    public void getBooksCollection() {
        library.getBooksCollection();
        String[] books = library.toString().split("\n");

        assertEquals(2, books.length);
        assertEquals("Aladin", books[0]);
        assertEquals("Caperucita", books[1]);
    }

    @Test
    public void getBookByIndex() {
        library.getBookByIndex(1);

        String[] books = library.toString().split("\n");
        assertEquals("Caperucita", books[1]);
    }

    @Test
    public void removeBookByTitle() {
        library.removeBookByTitle("Caperucita");

        String[] books = library.toString().split("\n");
        assertEquals(1, books.length);
        assertEquals("Aladin", books[0]);
    }

}
