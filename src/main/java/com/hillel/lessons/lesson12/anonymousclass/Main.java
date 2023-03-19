package com.hillel.lessons.lesson12.anonymousclass;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.shop.Beer;
import com.hillel.lessons.lesson12.shop.Whiskey;
import com.hillel.lessons.lesson17.homework17.Product;

public class Main {
    public static void main(String[] args) {
        BottleProduct bottleProduct = new Beer("BEER", 500, "DESIGN", "Ukraine",
                12.3, "Black");
        Beer beer1 = (Beer)bottleProduct;
        System.out.println(beer1.getBeerType());
        Beer beer = new Beer("BEER1", 1, "DESIGN2", "Ukraine",
                12.3, "Нефільтроване");
        Whiskey whiskey = new Whiskey("BE", 2, "WDisign", "Ukr", 11, 15, "type");

        printDesign(whiskey);

    }

    public static void printDesign(BottleProduct bottleProduct) {
        System.out.println(bottleProduct.getDescription());

    }
}
