package com.hillel.lessons.lesson19.optionalclass;

import com.hillel.lessons.lesson19.lambdaandmetodreferences.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Product> list = new ArrayList<>();

        list.add(new Product("P2", 100d));
        list.add(new Product("P1", 19d));
        list.add(new Product("P3", 190d));

        Optional<Product> product = list.stream()
                .filter(p->p.getPrice()<=90)
                .findFirst();
//        if (product.isPresent()){
//            System.out.println(product.get().getName());
//
//        }

        product.ifPresent(p->
                System.out.println(p.getName()));

        System.out.println(product.orElse(new Product("test", 12d)));

       // product.orElseGet((Supplier<? extends Product>) new Product("test",10d));
        product.orElseThrow(IOException::new);

        product.map(product1 -> product1.getName())
                .get();

    }
}
