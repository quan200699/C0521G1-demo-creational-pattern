package com.company.singleton;

public class Main {

    public static void main(String[] args) {
        Borrower borrower = new Borrower();
        Borrower borrower1 = new Borrower();
        borrower.borrowBook();
        System.out.println(borrower.getBookInfo());
        borrower1.borrowBook();
        System.out.println(borrower1.getBookInfo());
    }
}
