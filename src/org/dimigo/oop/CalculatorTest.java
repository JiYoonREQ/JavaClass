package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a=10, b=20;
        Calculator c=new Calculator(a,b);


        c.powerOn();
        System.out.println(a+" + "+b+" = "+c.add());
        System.out.println(a+" - "+b+" = "+c.sub());
        System.out.println(a+" * "+b+" = "+c.mul());
        System.out.println(a+" / "+b+" = "+c.div());
        c.powerOff();
    }
}
