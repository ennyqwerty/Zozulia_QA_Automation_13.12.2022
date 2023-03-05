package com.hillel.lessons.lesson12.main;

import com.hillel.lessons.lesson12.enams.ColorOfWine;
import com.hillel.lessons.lesson12.shop.Beer;
import com.hillel.lessons.lesson12.shop.Schampu;
import com.hillel.lessons.lesson12.shop.Whiskey;
import com.hillel.lessons.lesson12.shop.Wine;

public class Main {
    public static void main(String[] args) {
        Whiskey whiskey = new Whiskey(1, "Super", "Ukraine", -1, 9, "England");
//        whiskey.calculateGrade();
        System.out.println(whiskey.getGrade());
        System.out.println();

        Wine wine = new Wine(1,"Design fine", "Ukraine" ,12, ColorOfWine.RED);
        System.out.println(wine);
        System.out.println(wine.getDescription());

        Beer beer= new Beer(1,"nice", "Ukraine", 2.1,"beer type");
        beer.bubbling();

        Schampu schampu = new Schampu(1,"Design fine","Ukr", 12,ColorOfWine.ROSE);
        schampu.bubbling();

    }
}
