package com.hillel.lessons.lesson19.homework18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("fish", 109.5));
        products.add(new Product("melon", 22.5));
        products.add(new Product("apple", 9.1));
        products.add(new Product("agg", 10));
        products.add(new Product("milk", 4.99));
        products.add(new Product("green", 3.8));
        products.add(new Product("beans", 5.5));

        ProductMarket market = new ProductMarket(products);

        System.out.println("Всі назви продуктів - " + market.getProducts());
        System.out.println("Продукти по алфавіту - " + market.getAllNameToAlphabet());
        System.out.println("Ціни більше 10 - " + market.pricesMore());
        System.out.println("Ціни менше 5 - " + market.pricesLess());
        System.out.println("Всі ціни - " + market.getAllPricesToString());
   }
}
