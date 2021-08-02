package com.company.singleton;

public class Book {
    public static Book book;
    public static boolean isLoan;
    private String author;
    private String title;

    private Book() {
        this.author = "Quan";
        this.title = "Java Book";
        book = null;
        isLoan = false;
    }

    public static Book borrowBook() {
        if (!isLoan) {
            if (book == null) {
                book = new Book();
            }
            isLoan = true;
            return book;
        }
        return null;
    }

    public void returnBook() {
        isLoan = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
