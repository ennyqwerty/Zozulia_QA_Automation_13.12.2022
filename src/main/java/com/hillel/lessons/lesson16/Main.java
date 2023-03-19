package com.hillel.lessons.lesson16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String[] arr = new String[20];

        ArrayList<String> list = new ArrayList();
        list.add("hello");
        list.add("hi");
        list.add(2, "good morning");
        list.add(3, "good morning3");
        list.set(3, "rewrite");
        list.remove("rewrite");
        //list.clear();
        list.size();

        //System.out.println(list.get(2));

        for (String s : list) {
            if (s.contains("l")) {
                System.out.println(s);
            }
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("linkedlist hello");
        linkedList.add("linkedlist hi");
        linkedList.addFirst("first");
        linkedList.addLast("last");

        for (String s : linkedList) {
                System.out.println(s);
        }
    }
}
