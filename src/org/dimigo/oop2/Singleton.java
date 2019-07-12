package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance()
    {
        return instance;
    }

    public static synchronized Singleton getInstance2()
    {
        if(instance==null) {instance=new Singleton();}
        return instance;
    }
}
