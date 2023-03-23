package com.hillel.lessons.lesson17.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
   private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllNames() {
        List<String> productsNameList = new ArrayList<>();
        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        return productsNameList;
    }

    public List <String> getAllNameToAlphabet() {
        List<String> productsNameList = new ArrayList<>();

        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        Collections.sort(productsNameList);
        return productsNameList;
    }

    public List<Double> pricesMore(int price) {
        List<Double> sortPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() >= price) {
                sortPrices.add(product.getPrice());
            }
        }
        return sortPrices;
    }

    public List<Double> pricesLess(int price) {
        List<Double> sortPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() <= price) {
                sortPrices.add(product.getPrice());
            }
        }
        return sortPrices;
    }

    public List<String> allPrices() {
        List<String> allPrice = new ArrayList<>();
        for (Product product : products) {
            String priceToString = Double.toString(product.getPrice());
            allPrice.add(priceToString);
        }
        return allPrice;
    }


}
