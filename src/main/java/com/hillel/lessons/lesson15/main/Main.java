package com.hillel.lessons.lesson15.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
            System.exit(500);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
        } finally {
            //int y = 10 / 0;
            // System.exit(500); 3 - варіант при траї вирубить мережу/ сервак; мейн поток і в демон потоці випав ексепшн, то тоді файналі не буде виводитись
            System.out.println("Block finally");
        }
        System.out.println("Program is still running");

        //Multi catch blocking
        //catch може бути скільки завгодно, але  розміщення в коді повинно бути
        // в порядку возрастанія ієрархії ексепшенів (дитна=>>батьки) див картинку в ресурсах, урок 15
        // try може бути 1) try catch + finally; 2) try catch; 3) try + finally

        try {
            int x = 10 / 0;
            System.exit(500);
        } catch (ArithmeticException e) {
            System.out.println("Exception ArithmeticException");
        } catch (IllegalAccessError e) {
            System.out.println("Exception IllegalAccessError");
        } catch (RuntimeException e) {
            System.out.println("Exception RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            //int y = 10 / 0;
            // System.exit(500); 3 - варіант при траї вирубить мережу/ сервак; мейн поток і в демон потоці випав ексепшн, то тоді файналі не буде виводитись
            System.out.println("Block finally");
        }
        System.out.println("Program is still running");

        System.out.println("try finally");

        // try finally
        try {
            int x = 10 / 2;
        } finally {
            System.out.println("Block finally");
        }
        System.out.println("Program is still running");

        System.out.println(getC());
    }

    // throw - в методі створення виключення, можна побачити із-за чого падає
    // throws - вказує, що в методі можуть бути ексепшени, але вони можуть бути не відловленні в коді
    public void task1() {

    }

    public static IOException getException() throws IOException {
        throw new IOException();
    }

    public static int getX() throws ArithmeticException {
        int b = 10 / 0;
        return b;
    }

    public static int getC() {
        int c = 0;
        try {

            int a1 = 20;
            int b1 = 0;
            c = a1 / b1;
            if (b1 == 0)
                throw new ArithmeticException("Ділення на 0."); // створення виключення
        } catch (ArithmeticException e) {
            System.out.println("Застосування throw " + e);
        }
        return c;
    }

    public static String logIn(String login, String pass) throws IOException {
        if (login != null) {
            return "Login is success";
        } else throw new IOException("Login is wrong");
    }
}