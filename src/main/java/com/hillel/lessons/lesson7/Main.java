package com.hillel.lessons.lesson7;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[4]);

        int [] array2 = {1, 2, 3, 4, 5};
        int [] array3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(array.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

        int [] array4 = new int[0];

        System.out.println(array4.length);
        array4[9]=8;
        System.out.println(array4.length);


    }
}
