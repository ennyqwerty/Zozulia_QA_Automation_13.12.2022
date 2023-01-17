package com.hillel.lessons.lesson8;
import java.util.Scanner;

public class HomeWork10MatrixTransformation {
    public static void main(String[] args) {
        //Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
        // Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.


        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Будь ласка введіть довжину масиву ");
        while (true) {
            if (scanner.hasNextInt()) {
               n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Будь ласка введіть додатнє число");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Помилка, введіть додатнє число");
                scanner.nextLine();
            }
        }

        int m = 0;
        System.out.println("Будь ласка введіть довжину масиву ");
        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m < 0) {
                    System.out.println("Будь ласка введіть додатнє число");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Помилка, введіть додатнє число");
                scanner.nextLine();
            }
        }

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("Матриця №1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Матриця перевернута:");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
