package com.hillel.lessons.lesson19.homework18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
   private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getProductName(){
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllNameToAlphabet(){
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> pricesMore(){
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10 )
                .collect(Collectors.toList());
    }

    public List<Double> pricesLess(){
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 5 )
                .collect(Collectors.toList());
    }

    public List <String> getAllPricesToString(){
        return products.stream()
                .map(Product::getPrice)
                .map(String ::valueOf)
                .collect(Collectors.toList());
    }
}
