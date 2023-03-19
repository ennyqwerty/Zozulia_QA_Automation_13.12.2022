package com.hillel.lessons.lesson15.exceptions;

import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(getNumber());

    }

    public static void getException() throws IOException {
        throw new IOException();
    }

    public static int getNumber(){
        try {
            System.out.println("1");
            getException();
            System.out.println("1");
            System.out.println("1");
            return 1;
        }catch (IOException e){
            System.out.println("3");
            return 2;
        }finally {
            //return 5;
            System.out.println("11");
        }
    }
}
