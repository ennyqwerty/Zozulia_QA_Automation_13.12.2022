package com.hillel.lessons.lesson10;

public class HomeWork12Burgers {

    int meat;
    String bun;
    String cheese;
    String greens;
    String mayonnaise;

    public HomeWork12Burgers(int meat, String bun, String cheese, String greens, String mayonnaise) {
        this.meat = meat;
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Бургер звичайний>: \n" +
                "-котлет - " + meat + " шт\n" +
                "-" + bun + "\n" +
                "-" + cheese + "\n" +
                "-" + greens + "\n" +
                "-" + mayonnaise);
    }

    public HomeWork12Burgers(int meat, String bun, String cheese, String greens) {
        this.meat = meat;
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Дієтичний бургер: \n" +
                "-котлет - " + meat + " шт\n" +
                "-" + bun + "\n" +
                "-" + cheese + "\n" +
                "-" + greens);
    }

    public HomeWork12Burgers(String bun, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Веганиський бургер: \n" +
                "-" + bun + "\n" +
                "-" + cheese + "\n" +
                "-" + greens + "\n" +
                "-" + mayonnaise);
    }
}
