package com.hillel.lessons.lesson5;

public class HomeWork5 {
    public static void main(String[] args) {

        int warriorLee = 13;
        int archerLee = 24;
        int riderLee = 46;

        int warriorMinh = 9;
        int archerMinh = 35;
        int riderMinh = 12;

        int warriorCount = 860;
        double coefficient = 1.5;

        int allLee = (warriorLee + archerLee + riderLee) * warriorCount;
        int allMinh = (int) ((warriorMinh + archerMinh + riderMinh) * warriorCount * coefficient);

        System.out.println("Загальні атаки армії Лі - " + allLee);
        System.out.println();
        System.out.println("Загальні атаки армії Мін - " + allMinh);
    }
}
