package org.example.task_book;


public class Book implements Displayable{
    private String bookName;
    private String bookAuthor;
    private String bookDate;

    public void setBookName(String name) {
        this.bookName = name;
    }
    public String getBookName() {
        return this.bookName;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }
    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookDate(String book_date) {
        this.bookDate = book_date;
    }
    public String getBookDate() {
        return this.bookDate;
    }

    @Override
    public void print() {
        System.out.println("Название книги: " + getBookName());
        System.out.println("Автор книги: " + getBookAuthor());
        System.out.println("Дата издания книги: " + getBookDate());
    }
}
