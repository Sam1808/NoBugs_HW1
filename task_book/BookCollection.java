package org.example.task_book;

import java.util.HashSet;

public class BookCollection extends Book {
    private HashSet<Book> books;

    public void addBook(Book book) {
        this.books.add(book);
    };
    public void removeBook(Book book) {
        this.books.remove(book);
    };
    public void isExist(Book book) {
        this.books.contains(book);
    };
}
