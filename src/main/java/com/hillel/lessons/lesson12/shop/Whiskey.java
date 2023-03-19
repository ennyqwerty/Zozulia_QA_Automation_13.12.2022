package com.hillel.lessons.lesson12.shop;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;

public class Whiskey extends BottleProduct {

    private int years;
    private  String type;

    public Whiskey(String productName, int volume, String design, String manufacturer, double grade, int years, String type) {
        super(productName, volume, design, manufacturer, grade);
        this.years = years;
        this.type = type;
    }

    public  void  calculateGrade(){
        double grate = getGrade();
        for (int i = 0; i < years; i++){
            grate += 1;
        }
        setGrade(grate);
    }

    @Override
    public String getDescription() {
        return "Whiskey: " + getDesign() + " , with type: " + type + ", градуси " + getGrade();
    }
}
