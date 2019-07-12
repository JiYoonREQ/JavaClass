package org.dimigo.oop;

public class Count {
    public static int count=0;
    Count() {count++;}
    public static int getCount() {return count;}

    public static void main(String[] args) {
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
        for(int i=0; i<10000; i++) new Count();
        System.out.println(Count.getCount());
    }
}

