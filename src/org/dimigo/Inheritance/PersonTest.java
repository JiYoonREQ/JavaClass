package org.dimigo.Inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person("잔나비", 27, 180, 70);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("마재연", 18, 170, 65, "2609");
        s.eat();
        s.sleep();
        s.rollCall();
        s.study();

        Teacher t = new Teacher("김종수", 49, 180, 70, "화학");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();
    }
}
