package org.dimigo.collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // map 계열: key, value 쌍
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("kor", 100);
        map.put("mat", 101);
        map.put("eng", 102);
        map.put("eng", 95);
        printMap(map);

        System.out.println(map.get("asdfasdf"));

        map.remove("eng");
        printMap(map);

        map.clear();
        printMap(map);

        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("댄스곡1");
        list.add("댄스곡2");
        list.add("댄스곡3");
        map2.put("dance", list);


        List<Map<String,String>> list2 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("dance", "댄스곡");
        map3.put("ballad", "발라드곡");
        map3.put("hiphop", "힙합곡");
        list2.add(map3);

    }

    private static void printMap(Map<String, Integer> map) {
        for (String a:map.keySet())
        {
            System.out.println(a + ":" + map.get(a));
        }
        System.out.println();
    }
}