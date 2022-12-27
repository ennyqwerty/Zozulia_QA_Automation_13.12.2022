package com.hillel.lessons.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        double x = 46.952137120;
        double y = 32.005920410;
        //char degrees = 176;
        char degrees = '\u00B0';
        String city = "Mykolaiv";


        System.out.println(city);
        System.out.println("Latitude:" + x + degrees);
        System.out.println("Longitude:" + y + degrees);
        System.out.println();

        System.out.println(city + "\n" + "Latitude:" + x + degrees+"\n" + "Longitude:" + y + degrees );

    }
}
