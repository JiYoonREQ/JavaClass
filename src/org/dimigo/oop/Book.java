package org.dimigo.oop;

import java.util.*;
public class Book {
    private String title;
    private String author;
    private int page;

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPage() {return page;}

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public void setPage(int ppage) {
        this.page=page;
    }

    //기본생성자
    public Book()
    {
        System.out.println("기본 생성자 호출");
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author)
    {
        this(title, author,0);
    }
    public Book(String title)
    {
        this(title, "저자미상");
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
