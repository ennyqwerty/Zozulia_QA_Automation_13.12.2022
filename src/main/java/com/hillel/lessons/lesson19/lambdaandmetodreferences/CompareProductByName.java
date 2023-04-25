package com.hillel.lessons.lesson19.lambdaandmetodreferences;

import com.hillel.lessons.lesson19.lambdaandmetodreferences.Product;

import java.util.Comparator;

public class CompareProductByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
