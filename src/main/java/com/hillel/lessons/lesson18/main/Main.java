package com.hillel.lessons.lesson18.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int k = 0;
        System.out.println("Hash Map виводиться в рандомному порядку");
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put(null, "value");
        System.out.println(map.get("key"));
        System.out.println(map.containsKey(null));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println();

        for (Map.Entry<String, String> m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println();

        System.out.println("Linked Hash Map виводиться в заданому порядку");
        int k1 = 0;

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key", "value");
        linkedHashMap.put(null, "value");
        System.out.println(linkedHashMap.get("key"));
        System.out.println(linkedHashMap.containsKey(null));
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());

        System.out.println();

        for (Map.Entry<String, String> lm: linkedHashMap.entrySet()){
            System.out.println(lm.getKey() + " " + lm.getValue());
        }
    }
}
