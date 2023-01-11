package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class HomeWork7GuessNumber {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int setComputerNumber = (int) Math.round(Math.random() * 10);

    System.out.println("Число, яке задане комп'ютером = " + setComputerNumber);

    int setPlayerNumber = 0;
    for (int i = 1; i <= 3; i++) {
      System.out.println("Будь ласка, введіть число від 1 до 10");

      if (scanner.hasNextInt()) {
        setPlayerNumber = scanner.nextInt();
      }
      if (setComputerNumber == setPlayerNumber) {
        System.out.println("Вітаємо, ви вгадали число");{
          break;
        }
      } else {
        System.out.println("Вибачте, але ви не вгадали число.");
        scanner.nextLine();
      }

    }
  }
}
