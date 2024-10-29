package s1t4level1.l1ex1.src;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(this.getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

}
