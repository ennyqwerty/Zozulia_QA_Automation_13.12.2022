package com.hillel.lessons.lesson12.utils;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;

public final class PrintHelper {

    private PrintHelper(){};

    public static void printProductDesign(BottleProduct bottleProduct) {
        System.out.println(bottleProduct.getDescription());

    }
}
