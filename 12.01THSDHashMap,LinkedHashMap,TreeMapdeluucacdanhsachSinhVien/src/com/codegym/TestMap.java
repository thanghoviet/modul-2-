package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasMap=new HashMap<>();
        hasMap.put("Tu",18);
        hasMap.put("Dat",25);
        hasMap.put("Thang",23);
        hasMap.put("Son",26);
        hasMap.put("DuyAnh",24);
        hasMap.put("Hai",23);
        hasMap.put("XThang",27);
        hasMap.put("phuoc",19);
        hasMap.put("Thinh",20);
        System.out.println("Display entries in HashMap");
        System.out.println(hasMap + "\n");

        Map<String, Integer> treeMap=new TreeMap<>(hasMap);
        System.out.println("Display entries in HashMap");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Tu",18);
        linkedHashMap.put("Hai",23);
        linkedHashMap.put("phuoc",19);
        linkedHashMap.put("Thinh",20);
        System.out.println("\nThe age for " + "Thinhmom is " + linkedHashMap.get("Thinh"));
    }
}
