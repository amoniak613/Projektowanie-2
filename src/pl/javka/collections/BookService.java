package pl.javka.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<Book> getFantasyBooks() {
        return this.books.stream()
                .filter(book -> book.getGatunek().equals(Gatunek.FANTASY))
                .collect(Collectors.toList());
    }

    public List<Book> getBookOlderThan1999() {
        return this.books.stream()
                .filter(book -> book.getRokWydania() < 1999)
                .collect(Collectors.toList());
    }

    public Book getMostExpensive() {
        return Collections.max(this.books, Comparator.comparing(book -> book.getCena()));
    }

    public Book getLeasExpensive() {
        return Collections.min(this.books, Comparator.comparing(book -> book.getCena()));
    }
}
