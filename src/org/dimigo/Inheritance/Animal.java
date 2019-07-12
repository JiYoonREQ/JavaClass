package org.dimigo.Inheritance;

public class Animal {

    protected String name;

    public Animal(String name) {
     this.name=name;
    }
    public void eat()
    {
        System.out.println("냠냠");

    }
    public void sleep()
    {
        System.out.println("쿨쿨");
    }
    public void bark()
    {
        System.out.println("멍멍");
    }
    public String toString() {
        return "제 이름은 " + name + "입니다.";
    }
}
