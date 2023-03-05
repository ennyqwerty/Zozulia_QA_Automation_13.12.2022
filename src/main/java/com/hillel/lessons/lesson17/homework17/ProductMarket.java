package com.hillel.lessons.lesson17.homework17;

import java.util.ArrayList;
import java.util.List;

public class ProductMarket {
    private final List<Product> productList;


    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public List<String> getName(){
        List<String> name= new ArrayList<>();
        for (Product product: productList){
            name.add(product.getName());
        }
        return name;
    }
}
