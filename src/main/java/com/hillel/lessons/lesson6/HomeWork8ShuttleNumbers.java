package com.hillel.lessons.lesson6;

public class HomeWork8ShuttleNumbers {
    public static void main(String[] args) {

        int counterShuttle = 0;
        for (int i = 1; counterShuttle < 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 ||
            i / 100 == 4 || i / 100 == 9 ||  i / 10 % 10 == 4 || i / 10 % 10 == 9) {
                continue;
            }
            System.out.println("Номер шатлу: " + i);
            counterShuttle++;
        }
        System.out.println("Counter shuttle = " + counterShuttle);
    }
}
