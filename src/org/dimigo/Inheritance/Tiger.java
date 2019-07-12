package org.dimigo.Inheritance;

public class Tiger extends Animal {
    public Tiger(String name)
    {
        super(name);
    }

    //부모클래스의 메소드를 자식클래스에서 재정의
    //메소드 오버라이딩(Overriding), toString()도 임
    public void bark()
    {
        System.out.println("어후");
    }

    public void hunt()
    {
        System.out.println(name+"이/가 사냥을 한다.");
    }
}
