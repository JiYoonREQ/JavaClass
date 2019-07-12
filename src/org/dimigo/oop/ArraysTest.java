package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src={"서울","의왕","시흥","수성구"};

        System.out.println(Arrays.toString(src));

       String[] dest= Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));
        System.out.println(src==dest);

        System.out.println(Arrays.equals(dest, src));

        Arrays.sort(dest);

        System.out.println(Arrays.binarySearch(dest, "의왕"));
        System.out.println(Arrays.binarySearch(dest, "123"));

    }
}
