package org.dimigo.oop;

public class paramArray {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5};
        add(intArr,10);
        printArray(intArr);

        String[] names={"홍길동","홍길서","홍길남","홍길북"};
        changeName(names,"김");
        printArray(names);
    }

    private static void printArray(String[] names) {
        for(String a:names) System.out.println(a);
    }

    private static void changeName(String[] names, String change) {
        for(int i=0; i<names.length; i++)
        {
            names[i] = change + names[i].substring(1);
        }
    }

    public static void add(int[] intArr, int num)
    {
        for(int i=0; i<intArr.length; i++) intArr[i]+=num;
    }
    public static void printArray(int[] intArr)
    {
        for(int k : intArr) System.out.println(k);
    }
}
