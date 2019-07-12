package org.dimigo.oop;

public class BookTest2 {

    public static void main(String[] args)
    {
        int String=6;
        String a=";";
        System.out.println(String);

        int num=5;
        methodA(num);
        System.out.println(num);


        Book book = new Book("수학의 바이블");
        methodB(book);
        System.out.println(book.getTitle());

        methodC(book);
        System.out.println(book.getTitle());

        Book book2=new Book();
        //System.out.println(book2.getTitle().length());


    }

    private static void methodC(Book book) {
        book.setTitle("이것이 자바다");
        System.out.println(book.getTitle());
    }

    private static void methodB(Book book) {
        book=new Book("이것이 자바다");
        System.out.println(book.getTitle());
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }
}
