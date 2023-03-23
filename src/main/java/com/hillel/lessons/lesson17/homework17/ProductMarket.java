package com.hillel.lessons.lesson17.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
   private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public String getAllNames() {
        List<String> productsNameList = new ArrayList<>();
        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        return productsNameList.toString();
    }

    public String getAllNameToAlphabet() {
        List<String> productsNameList = new ArrayList<>();

        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        Collections.sort(productsNameList);
        return productsNameList.toString();
    }

    public String pricesMore(int price) {
        List<Double> sortPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() >= price) {
                sortPrices.add(product.getPrice());
            }
        }
        return sortPrices.toString();
    }

    public String pricesLess(int price) {
        List<Double> sortPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() <= price) {
                sortPrices.add(product.getPrice());
            }
        }
        return sortPrices.toString();
    }

    public String allPrices() {
        List<Double> allPrices = new ArrayList<>();
        for (Product product : products) {
            allPrices.add(product.getPrice());
        }
        return allPrices.toString();
    }


}
