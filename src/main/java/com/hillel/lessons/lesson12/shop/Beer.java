package com.hillel.lessons.lesson12.shop;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.interfaces.Bubbling;

public final class Beer extends BottleProduct implements Bubbling {
    private String beerType;

    public Beer(int volume, String design, String manufacturer, double grade, String beerType) {
        super(volume, design, manufacturer, grade);
        this.beerType = beerType;
    }

    @Override
    public String getDescription() {
        return "Beer: " + getDesign() + " , with type: " + beerType;
    }

    @Override
    public void bubbling() {
        System.out.println("Beer:" + beerType + " піниться");
    }
}
