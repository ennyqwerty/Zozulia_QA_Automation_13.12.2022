package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        //Оператори порівняння.

        //Більше-менше
        //Рівно / Не рівне
        //Більше або однаково / менше або однаково

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b); //рівно
        System.out.println(a != b); // не рівно, інверсія, не дорівнює

        boolean isBigger = a > b;

        System.out.println(isBigger);

        boolean booleanTrue = true;

        System.out.println(!booleanTrue);// ! змінює логічне значення

        //Логічні оператори.
        //Оператор IF
        //Оператор ELSE
        //Оператор ELSE IF
        //Вкладений IF
        int a1 = 20;
        int b1 = 20;

        if (a1 > b1){
           System.out.println("a1>b1");
        } else {
            System.out.println("a <= b");
        }

        int a2 = 20;
        int b2 = 20;

        if (a2 > b2){
            System.out.println("a2>b2");
        }
        if (a2 < b2){
            System.out.println("a2<b2");
        }
        if (a2 == b2){
            System.out.println("a2==b2");
        }
        //оптимізація попереднього запису
        System.out.println("оптимізація попереднього запису");
        if (a2 > b2){
            System.out.println("a2>b2");
        }else if (a2 < b2) {

        } else if (a2 == b2) {
            System.out.println("a2 == b2");
        }

        //Логічне І
        //Логічне АБО

        int a3 = 1;
        int b3 = 2;
        int c3 = 3;

        System.out.println("логіний оператор І = &&, АБО = ||");

        if ( a3 < b3 || b3 < c3) {
            System.out.println("Hello");
        }


        //Switch-case
        //Тернарні оператори - використовують у простих порівннях
        // (умова) ? вираз1 : вираз2
        System.out.println("Тернарні оператори");
        System.out.println((a3 > b3) ? "yes" : "no");

        // (умова) ? вираз1 : вираз2
        System.out.println((a3 > b3) ? "a3 > b3" : (a3== b3) ? "a3 = b3" : "a3 < b3");


       int a4 = 3;

        if (a4 == 1) {
            System.out.println("do something 1");
        } else if (a4 == 2) {
            System.out.println("do something 2");
        } else if (a4 == 3) {
            System.out.println("do something 3");
        } else if (a4 == 4) {
            System.out.println("do something 4");
        } else if (a4 == 5) {
            System.out.println("do something 5");
        } else if (a4 == 6) {
            System.out.println("do something 6");
        } else {
            System.out.println("do default");
        }


        int a5 = 0;
        switch (a5) {
            case 1: {
                System.out.println("do something 1");
               break;
           }
            case 2: {
               System.out.println("do something 2");
                break;
            }
            case 3: {
                System.out.println("do something 3");
                break;
            }
            case 4: {
                System.out.println("do something 4");
                break;
            }
            case 5: {
                System.out.println("do something 5");
                break;
            }
            case 6: {
                System.out.println("do something 6");
                break;
            }
            default: {
                System.out.println("do default");
                break;
            }
        }


        String str = "QWERTY";
        String str2 = new String("QWERTY");


        System.out.println(str == str2);
        System.out.println(str.equalsIgnoreCase(str2));

        switch (str) {
            case "QWERT" : {
                System.out.println("1");
                break;
            }
            case "Q" : {
                System.out.println("2");
                break;
            }
            case "QWERTY" : {
                System.out.println("3");
                break;
            }
        }


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter integer");
//        int value = scanner.nextInt();
//
//        System.out.println("value = " + value);

//        String next = scanner.nextLine();
//        System.out.println("next = " + next);
//
//
//        String next2 = scanner.nextLine();
//        System.out.println("next2 = " + next2);


//        int value = scanner.nextInt();
//        System.out.println("value = " + value);
//        int value2 = scanner.nextInt();
//        System.out.println("value2 = " + value2);
//        scanner.nextLine();
//
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

 //       if (scanner.hasNextInt()) {
//            int value = scanner.nextInt();
 //           System.out.println("value = " + value);
 //       } else {
 //           System.out.println("Wrong data!");
 //           System.exit(0);
 //       }


    }
}
