package org.dimigo.oop;

public class Calculator2 {

    public boolean powerFlag;
    public void powerOn()
    {
        if(!powerFlag)
        {
            System.out.println("전원을 켭니다.");
            powerFlag=true;
        }
    }
    public void powerOff()
    {
        if(powerFlag)
        {
            System.out.println("전원을 끕니다.");
            powerFlag=false;
        }
    }


    public static int add(int num1, int num2, Calculator2 c) {c.powerOn(); return num1+num2;}
    public static int sub(int num1, int num2, Calculator2 c) {c.powerOn(); return num1-num2;}
    public static int mul(int num1, int num2, Calculator2 c) {c.powerOn(); return num1*num2;}
    public static double div(int num1, int num2, Calculator2 c) {c.powerOn(); return (double)num1/num2;}

    public static void main(String[] args) {
        int a=10, b=20;

        Calculator2 c = new Calculator2();

        System.out.println(a+" + "+b+" = "+Calculator2.add(a, b, c));
        System.out.println(a+" - "+b+" = "+Calculator2.sub(a, b, c));
        System.out.println(a+" * "+b+" = "+Calculator2.mul(a, b, c));
        System.out.println(a+" / "+b+" = "+Calculator2.div(a, b, c));
        c.powerOff();
    }
}
