package org.dimigo.abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals= {
          new Duck(), new Pig(), new Cow()
        };
        System.out.println("=== 평온한 동물농장 ===");
        for(Animal animal : animals)
        {
            animal.eat();
        }

        System.out.println("=== 늑대가 나타났다 ===");
        for(Animal animal : animals)
        {
            animal.bark();
        }
    }
}
