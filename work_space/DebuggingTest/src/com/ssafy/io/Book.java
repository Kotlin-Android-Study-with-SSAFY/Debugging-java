package com.ssafy.io;

import java.util.ArrayList;
import java.util.List;
import com.ssafy.util.SHA256;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int price;
    private String ssn;

    public Book(String title, String author, String isbn, int price) {
        super();
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        SHA256 sha256 = new SHA256();
        this.ssn = sha256.encrypt(isbn);
    }

    public static List<Book> previewData() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", "978-0134685991", 45000));
        books.add(new Book("Clean Code", "Robert C. Martin", "978-0132350884", 40000));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0201616224", 38000));
        books.add(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50000));
        books.add(new Book("Refactoring", "Martin Fowler", "978-0201485677", 42000));
        books.add(new Book("Head First Java", "Kathy Sierra", "978-0596009205", 35000));
        books.add(new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606", 47000));
        books.add(new Book("Spring in Action", "Craig Walls", "978-1617294945", 52000));
        books.add(new Book("Kotlin in Action", "Dmitry Jemerov", "978-1617293290", 48000));
        books.add(new Book("Domain-Driven Design", "Eric Evans", "978-0321125217", 55000));
        return books;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn() {
        SHA256 sha256 = new SHA256();
        this.ssn = sha256.encrypt(isbn);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price
                + ", ssn=" + ssn + "]";
    }


}
