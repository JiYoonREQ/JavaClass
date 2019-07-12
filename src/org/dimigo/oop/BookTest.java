package org.dimigo.oop;

import java.util.*;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book=new Book();

        System.out.println("123");
        Book book2=new Book();
        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book("모순 수업", "최인호");
        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPage());
    }
}