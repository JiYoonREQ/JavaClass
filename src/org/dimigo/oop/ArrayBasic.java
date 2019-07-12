package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] intArr=null;
        intArr=new int[5];
        printArray(intArr);

        double[] doubleArr=new double[5];
        printArray(doubleArr);

        int[] intArr2={1,2,3,4,5,};
        printArray(intArr2);

        String[] strArr=new String[3];
        printArray(strArr);

        strArr[0]="치킨";
        strArr[1]="족발";
        strArr[2]="짜장면";
        printArray(strArr);

        String[] strArr2={"트와이스", "블랙핑크","로버트 할리"};
        printArray(strArr2);

        Book[] bookArr=new Book[2];
        bookArr[0]=new Book("수학의 바이블","김재영",100);
        bookArr[1]=new Book("워마드스터","전유원",200);

        printArray(bookArr);

        Book[] bookArr2={new Book("수학의 바이블","김재영",100), new Book("워마드스터","전유원",200)};
        printArray(bookArr2);

        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]);

        String[] strArr3=new String[3];
        // System.out.println(strArr3[0].length());

        Book[] bookArr3=new Book[3];
        //  System.out.println(bookArr3[0].getTitle());

        String[] strArr4= null;
        strArr4=new String[]{"a","b","c"};


    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr)
            System.out.println(value);

    }

    private static void printArray(String[] strArr) {
        for(String value : strArr)
        {
            System.out.println(value);
        }
    }

    private static void printArray(int[] intArr)
    {
        // for(int i=0; i<intArr.length; i++)
        //     System.out.println(intArr[i]);
        for(int value : intArr)
        {
            System.out.println(value);
        }
    }
    private static void printArray(double[] doubleArr)
    {
        // for(int i=0; i<intArr.length; i++)
        //     System.out.println(intArr[i]);
        for(double value : doubleArr)
        {
            System.out.println(value);
        }
    }
}
