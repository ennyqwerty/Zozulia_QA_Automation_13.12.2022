package com.hillel.lessons.lesson6;

public class Main {
    public static void main(String[] args) {

//        FOR

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }

//        int i = 0;
//
//        for ( ; ; ) {
//
//            if (i == 10) {
//                break;
//            }
//
//            i++;
//
//            if (i == 5 || i == 7) {
//                continue;
//            }
//
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 10; i++) {
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ


//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }


//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum = -1;
//
//        System.out.print(number1 + " " + number2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//
//            number1 = number2;
//            number2 = sum;
//        }


        // WHILE

        //  WHILE (БЛОК УМОВИ ВИХОДУ З ЦИКЛУ) { .... }

//        int i = 1;
//        while (true) {
//            if (i == 11) {
//                break;
//            }
//
//            System.out.println(i);
//            i++;
//
//        }

//        int i = 20;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 30);


//        Scanner scanner = new Scanner(System.in);
//        int userValue = -1;
//        while (true) {
//            System.out.println("Please enter integer");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                System.out.println("user value = " + userValue);
//                break;
//            } else {
//                System.out.println("Wrong data!");
//                scanner.nextLine();
//            }
//        }



//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int i = 10;
//
//        while (i >= 0) {
//            int random = (int) (Math.round(Math.random() * 100));
////            int random = (int) (Math.random() * 101);
//            System.out.println(i);
//
//            System.out.println("random number = " + random);
//            if (random >= 85 && random <= 100) {
//                System.out.println("WIN!!!");
//                break;
//            }
//
//            if (i == 0) {
//                System.out.println("BOOOOOOM!!!!!");
//            }
//
//            i--;
//        }



//        2)
//        Обчислити факторіал числа від 1 до N (вводимо з консолі) (1 - 10)
//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;


//        Scanner scanner = new Scanner(System.in);
//        int numberForFactorial = -1;
//
//        while (true) {
//            System.out.println("Please enter number from 1 to 10");
//            if (scanner.hasNextInt()) {
//                numberForFactorial = scanner.nextInt();
//                if (numberForFactorial >= 1 && numberForFactorial <= 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Wrong data!");
//                scanner.nextLine();
//            }
//        }
//
//
////        5! = 1 * 2 * 3 * 4 * 5;
//        int result = 1;
//        for (int i = 1; i <= numberForFactorial; i++) {
////            result = result * i;
//            result *= i;
//        }
//
//        System.out.println(result);




//        3) Homework
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

//        1 2 3 5 6 7 8 10 11 12 13 15 16 17 18

        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 | i % 10 == 9) {
                continue;
            }
            System.out.println(i);
            counter++;
        }

        System.out.println("counter = " + counter);

//        34

//        System.out.println(34 / 10);
//        System.out.println(34 % 10);





//        int a = 5;
//        int b = 7;
//
//        if (a > b) {
//            System.out.println("YES");
//            System.out.println("YES");
//        }

//        for (int i = 0; i < 2; i++) {
//            System.out.println("YES " + i);
//        }
//        System.out.println("NO ");


    }
}
