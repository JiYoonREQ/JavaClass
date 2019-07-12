package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr=new int[2][3];
        printArray(intArr);

        intArr[0][2]=100;
        intArr[1][1]=100;

        String[][] strArr=new String[][]{{"C","C++","Java"},new String[]{"C#","PHP"}};

        printArray(strArr);
    }

    private static void printArray(String[][] strArr) {
        for(int i=0; i<strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++)
                System.out.printf("%s ", strArr[i][j]);
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {
//        for(int[] a : intArr) {
//            for (int i : a)
//                System.out.printf(i + " ");
//            System.out.println();
//        }

        for(int i=0; i<intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++)
                System.out.printf("%d ", intArr[i][j]);
            System.out.println();
        }
    }
}
