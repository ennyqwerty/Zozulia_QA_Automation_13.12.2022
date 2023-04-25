package com.hillel.lessons.lesson19.sreams;

import com.hillel.lessons.lesson19.lambdaandmetodreferences.CompareProductByName;
import com.hillel.lessons.lesson19.lambdaandmetodreferences.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("P2", 128d));
        list.add(new Product("j1", 99d));
        list.add(new Product("P3", 121d));


        //list.forEach(System.out::println);

        list.stream()
                .map(p -> p.getName())
                .forEach(System.out::println);

        boolean i = list.stream()
                .map(p -> p.getName())
                .anyMatch(str->str.startsWith("j"));
        System.out.println(i);
    }
}
