package com.hillel.lessons.lesson12.anonymclass;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.shop.Beer;
import com.hillel.lessons.lesson12.shop.Whiskey;

public class Main {
    public static void main(String[] args) {

        BottleProduct bottleProduct = new Beer("beer", 700,"nice design", "Ukr",12.1,"white");

        Beer beer1 = (Beer)bottleProduct;
        beer1.getBeerType();

        Beer beer = new Beer("beer", 700,"nice design2", "Ukr",10,"white");

        Whiskey whiskey = new Whiskey("Visky", 1,"new design", "Ukr",11,23,
                "TYPE viski");
        printDesign(bottleProduct);
        printDesign(beer);
        printDesign(whiskey);
    }

    public static void  printDesign(BottleProduct bottleProduct){
        System.out.println(bottleProduct.getDescription());

    }
}
