package com.hillel.lessons.lesson7;

import java.util.Arrays;

public class HomeWork9Rugby {
    public static void main(String[] args) {

        //Є дві команди регбі з 25 гравців різного віку у кожній.
        //Вік беремо випадковим чином в діапазоні від 18 до 40.
        //Виведіть у двох рядках вік гравців кожної команди.
        //Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int count = 25;
        int [] countPlayersTeam1 = new int[count];
        int [] countPlayersTeam2 = new int[count];
        int min = 18;
        int max = 40;

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < count; i++) {
            countPlayersTeam1[i] = (int) (min + (Math.random() * (max - min + 1)));
            countPlayersTeam2[i] = (int) (min + (Math.random() * (max - min + 1)));

            sumTeam1 += countPlayersTeam1[i];
            sumTeam2 += countPlayersTeam2[i];

        }

        double avgTeam1 =  (double) sumTeam1 / count;
        double avgTeam2 =  (double) sumTeam2 / count;

        System.out.println("Вік гравців 1 команди " + Arrays.toString(countPlayersTeam1));
        System.out.println("вік гравців 2 команди " + Arrays.toString(countPlayersTeam2));

        System.out.println("Середній вік гравців 1 команди = " + avgTeam1);
        System.out.println("Середній вік гравців 2 команди = " + avgTeam2);
    }
}
