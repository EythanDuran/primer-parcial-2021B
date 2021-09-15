package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private String name;
    private List<Book> books = new ArrayList<>();

    public BookCollection(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public void addBook(Book book) {
        books.add(book);

    }

    public List<Book> getBooks() {return books;}

    public int getStars() {
        int prom = 0;
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            prom += book.getStars();
        }
        return prom / books.size();
    }
}


