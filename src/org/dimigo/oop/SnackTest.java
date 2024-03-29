package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snacks=new Snack[]{ new Snack("새우깡","농심",1100,2),
                                    new Snack("콘칲","크라운",1200,1),
                                    new Snack("허니버터칩","해태",1500,4)};
        int total=0;
        for(int i=0; i< snacks.length; i++)
        {
            System.out.println(snacks[i].toString());
            total+=snacks[i].calcPrice();
        }
        System.out.printf("총 구매 금액 : %,d원\n", total);
        System.out.println(snacks.length);
        System.out.println(snacks[0].getName().length());
    }
}
