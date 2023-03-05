package com.hillel.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    //        Integer[] array = {1, 5, -2, 99, 7, -7, 44, -55, 65};

//        System.out.println("before sort:" + Arrays.toString(array));
//        int counter = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("after sort:" + Arrays.toString(array));
//
//        System.out.println("counter = " + counter);

//        Arrays.sort(array);
//        System.out.println("sort: " + Arrays.toString(array));

//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println("sort: " + Arrays.toString(array));

//        System.out.println(Arrays.binarySearch(array, 6));


    //-----------------------------------------------------------//


//        int[][] array = new int[3][4];
//
//        array[0][0] = 77;
//        array[0][1] = 2;
//        array[0][2] = 5;
//        array[0][3] = 6;
//
//        array[1][0] = 7;
//        array[1][1] = 6;
//        array[1][2] = 10;
//        array[1][3] = 13;
//
//        array[2][0] = 11;
//        array[2][1] = 5;
//        array[2][2] = 3;
//        array[2][3] = 4;
//
////        System.out.println(array.length);
////        System.out.println(array[0].length);
//
//
////        System.out.println(Arrays.deepToString(array));
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//
//        int[] array1 = array[0];
//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }


//        int[][] array = {
//                {77, 2, 5, 6},
//                {7, 6},
//                {11, 5, 3},
//                {},
//                {1,1,1,1,1,1,1,1,1,1,1}
//        };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


    //
//        int[][][] array = new int[3][2][4];
    int[][][] array = {
            {
                    {18, 28, 18, 28},
                    {45, 90, 45, 0}
            },
            {
                    {7, 125, 500, 5},
                    {0, 11, 25, 30}
            },
            {
                    {81, 17, 19, 55},
                    {1, 7, 38, 11}
            }
    };

        System.out.println(array.length);

        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

        System.out.println(array[0][0].length);
        System.out.println(array[0][1].length);


        System.out.println(array[2][0][0]);
        System.out.println(array[2][0][1]);
        System.out.println(array[2][0][2]);
        System.out.println(array[2][0][3]);


        System.out.println(Arrays.deepToString(array));
        System.out.println();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[i][j].length; k++) {
                System.out.print(array[i][j][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }




}


    static void task2() {

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W         // 00, 02, 04, 06 - 0, 2, 4, 6
//      W B W B W B W B         // 11, 13, 15, 17 - 2, 4, 6, 8
//      B W B W B W B W         // 20, 22, 24, 26 - 2, 4, 6, 8
//      W B W B W B W B         // 31, 33, 35, 37 - 4, 6, 8, 10
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = "B";
//                } else {
//                    array[i][j] = "W";
//                }

                array[i][j] = ((i + j) % 2 == 0) ? "B" : "W";

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    static void task1() {

// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//      1 0 0 0 0       // 0 0
//      0 1 0 0 0       // 1 1
//      0 0 1 0 0       // 2 2
//      0 0 0 1 0       // 3 3
//      0 0 0 0 1       // 4 4

//      0 0 0 0 1       // 0 4
//      0 0 0 1 0       // 1 3
//      0 0 1 0 0       // 2 2
//      0 1 0 0 0       // 3 1
//      1 0 0 0 0       // 4 0


        int[][] array = new int[5][5];

        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // version 2
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }


        // version 2
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            if (i + j == array.length - 1) {
//                array[i][j] = 1;
//            }
//        }

        // version 3
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
