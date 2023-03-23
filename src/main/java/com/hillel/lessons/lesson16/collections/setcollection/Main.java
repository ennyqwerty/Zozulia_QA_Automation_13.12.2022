package com.hillel.lessons.lesson16.collections.setcollection;

import com.hillel.lessons.lesson12.shop.Beer;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Beer beer = new Beer("Beer new", 500, "design cool", "UKR", 4, "White");

        Beer beer1 = new Beer("Beer new", 200, "design cool", "UKR", 14, "black");

        Beer beer2 = new Beer("New", 100, "design good", "UKR", 10, "dark");

        Set<Beer> beers = new HashSet<>();
        beers.add(beer);
        beers.add(beer1);
        beers.add(beer2);

        for (Beer b : beers) {
            System.out.println(b.toString());
        }
    }
}
