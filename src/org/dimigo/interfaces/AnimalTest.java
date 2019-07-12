package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        //IAnimal.FARM_NAME2 ="sdf";
        IAnimal.welcome();

        IAnimal[] animals = {
                new Dog(),
                new Cat()
        };
        for(IAnimal animal : animals)
        {
            animal.eat();
            animal.sleep();
            animal.bark();
        }
    }
}
