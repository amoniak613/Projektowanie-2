package pl.javka.collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Jan", "Kowalski", "M");
        Author a2 = new Author("Jhon", "Doe", "M");
        List<Author> authors = new LinkedList<Author>();
        authors.add(a1);
        authors.add(a2);

        Book b1 = new Book("Tytul 1", 12, 1978, authors, Gatunek.FANTASY);
        Book b2 = new Book("Tytul 2", 122, 1978, authors, Gatunek.KRYMINAL);
        Book b3 = new Book("Tytul 3", 52, 1978, authors, Gatunek.FANTASY);


        List<Book> books = new LinkedList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        BookService bookService = new BookService(books);
        Book b4 = new Book("Tytul 4", 24, 1978, authors, Gatunek.ROMANS);
        bookService.addBook(b4);
        System.out.println("Dodanie ksiazki 4");
        System.out.println(bookService.getBooks());
        bookService.removeBook(b2);
        System.out.println("Po usunieciu ksiazki 2");
        System.out.println(bookService.getBooks());
        bookService.addBook(b2);

        System.out.println("Data wydania przed 1999");
        System.out.println(bookService.getBookOlderThan1999());
        System.out.println("Ksiazki fantasy");
        System.out.println(bookService.getFantasyBooks());
        System.out.println("Najtansza ksiazka");
        System.out.println(bookService.getLeasExpensive());
        System.out.println("Najdrozsza ksiazka");
        System.out.println(bookService.getMostExpensive());

    }
}
