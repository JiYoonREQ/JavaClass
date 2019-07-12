package org.dimigo.oop2;

public class Person {
   // private static final String TYPE = "포유류";
    private final String birthDate;
    private String name;
    public static final String SPECIES = "포유류";



    public Person(String birthDate, String name)
    {
        this.birthDate=birthDate;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "species='" + SPECIES + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        Person p1= new Person("20020813","김지윤");
        Person p2= new Person("20020222","종수");
        System.out.println(p1);
        System.out.println(p2);


        System.out.println(Person.SPECIES);
    }
}










