package com.hillel.lessons.lesson12.shop;

import com.hillel.lessons.lesson12.enams.ColorOfWine;
import com.hillel.lessons.lesson12.interfaces.Bubbling;

public class Schampu extends Wine implements Bubbling {

    public Schampu(String productName, int volume, String design, String manufacturer, double grade, ColorOfWine color) {
        super(productName, volume, design, manufacturer, grade, color);
    }


    @Override
    public void bubbling() {
        System.out.println("Schampu:" + " обємом = " + getVolume() + " , дизайн " + getDesign()   + " піниться");
    }
}
