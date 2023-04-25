package com.hillel.lessons.lesson19.lambdaandmetodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("P2", 128d));
        list.add(new Product("P1", 100d));
        list.add(new Product("P3", 121d));

        CompareProductByName comp = new CompareProductByName();

        Collections.sort(list, comp);
        list.forEach(System.out::println);


        Comparator<Product> pr = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println();
        System.out.println("лямда");

        //лямда
        Collections.sort(list,
                Comparator.comparing(p -> p.getName()));

        list.forEach(System.out::println);

        //метод референс
        System.out.println();
        System.out.println("метод референс");
        Collections.sort(list,
                Comparator.comparing(Product::getName));

        list.forEach(System.out::println);

        System.out.println("метод референс.......");
        for (Product p : list){
            System.out.println(p);
        }
    }
}
