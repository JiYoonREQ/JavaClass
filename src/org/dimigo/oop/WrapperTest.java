package org.dimigo.oop;

import org.dimigo.basic.PrimitiveDataType;

import java.util.Scanner;

public class WrapperTest {
    public static void main(String[] args) {



        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.toBinaryString(1000));
        System.out.println(Integer.toOctalString(1000));
        System.out.println(Integer.toHexString(1000));

        Integer i1=new Integer(100);
        Integer i2=new Integer("100");
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        Integer i3=Integer.valueOf(200);
        Integer i4=Integer.valueOf("200");
        Double d1=Double.valueOf(3.14);

        int r1=i1.intValue();
        double r2=d1.doubleValue();
        int r3=Integer.parseInt("300");
        double r4=Double.parseDouble("3.14");


        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+b);

        Integer obj1=new Integer(1000);
        Integer obj2=new Integer(2000);
        System.out.println(obj1+obj2);

        Integer c=1000;
        int d=c+100;

        Integer e=100; //오토 박싱
        Integer f=e+20; //오토언박싱, 오토박싱
        Integer result=e+f; //오토언박싱*2, 오토박싱

        final int round;


    }
}
