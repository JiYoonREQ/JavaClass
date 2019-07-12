package org.dimigo.Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a=new Animal("아무개");
        System.out.println(a);
        a.bark();
        a.sleep();
        a.eat();
        Dog d=new Dog("댕댕이");
        System.out.println(d);
        d.bark();
        d.sleep();
        d.eat();
        d.wag();
       Cat c=new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal[] animals=
                {
                        new Dog("멍멍이"),
                        new Cat("야옹이"),
                        new Tiger("호돌이")
                };
        for(Animal animal : animals)
        {
            //System.out.println(animal);
           // animal.bark();
            doBark(animal);
        }

        Animal a2 = new Cat("야옹이");
        a2.bark();
        a2.eat();
        ((Cat) a2).scratch();

       // Dog d2=(Dog)a2; //class casting Exception
       // Cat c2= (Cat)new Animal("asd"); 캐스팅 하면 안됌

        Animal dog = new Dog("멍뭉이");
        Animal cat = new Cat("야웅이");
        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);

    }

    private static void doBark(Animal animal)
    {
        System.out.println(animal);
        animal.bark();
        if(animal instanceof  Dog) ((Dog)animal).wag();
        if(animal instanceof  Cat) ((Cat)animal).scratch();
    }
}
