package com.company.singleton;

public class Borrower {
    private Book borrowBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowBook = Book.borrowBook();
        if (borrowBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getBookInfo(){
        return borrowBook.toString();
    }

    public void returnBook(){
        borrowBook.returnBook();
    }
}
