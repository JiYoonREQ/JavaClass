package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        //자동형변환 (Promotion, 작은 타입-> 큰 타입)
        byte b=10;
        short s=b;
        int  i=s;
        long l=i;
        System.out.printf("%d %d %d %d\n", b, s, i , l);

        //강제형변환 (Casting, 큰 타입 -> 작은 타입)

        i=(int)l;
        s=(short)i;
        b=(byte)s;

        System.out.printf("%d %d %d %d\n", b, s, i , l);

        int i2=128;
        byte b2=(byte)i2;

        System.out.println(b2);

        long l2=10000000000L;
        int i3=(int)l2;

        System.out.println(i3);
    }
}
