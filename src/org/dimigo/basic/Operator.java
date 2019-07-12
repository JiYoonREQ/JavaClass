package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int a=5, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println((float)a/b);
//        System.out.println(a/0);

        int i=10;
        double d=3.14;
        int r=(int)(i+d);
        System.out.println(r);

        short s1=1, s2=2;
        short r3=(short)(s1+s2);

        // Short-Circuit
        boolean flag=true;
        if(flag || (1/0==0))
            System.out.println("OR 연산");
        if(!flag && (1/0==0))
            System.out.println("AND 연산");

        //문자열 연결 연산자
        String school="디미고";
        int grade=2;
        int ban=6;
        String name="엌";
        System.out.println(school+grade+ban+name);
        System.out.println(grade+(ban+school)+name);
    }
}
