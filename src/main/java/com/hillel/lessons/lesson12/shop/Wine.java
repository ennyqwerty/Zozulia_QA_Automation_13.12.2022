package com.hillel.lessons.lesson12.shop;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.enams.ColorOfWine;

public class Wine extends BottleProduct {

    private ColorOfWine color;

    public Wine(String productName, int volume, String design, String manufacturer, double grade, ColorOfWine color) {
        super(productName, volume, design, manufacturer, grade);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Wine: " + getDesign() + " , with color: " + color.getColor();
    }

    public Wine(String productName, int volume, String design, String manufacturer, double grade) {
        super(productName, volume, design, manufacturer, grade);
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    @Override
    public String getDesign() {
        return super.getDesign();
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public double getGrade() {
        return super.getGrade();
    }

    @Override
    public String toString() {
        return "Wine{" +
                "volume=" + getVolume() +
                ", design='" + getDesign() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", grade=" + getGrade() +
                ", color=" + color.getColor() +
                '}';
    }
}
