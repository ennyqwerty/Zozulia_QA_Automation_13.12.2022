package com.hillel.lessons.lesson11.homework13;

public class Main {
    //Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
    //
    //Зробіть класи, які його імплементують: Androids, iPhones.
    //
    //Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати IOS
    //
    //Створіть екземпляри кожного виду у мейн-класі

    public static void main(String[] args) {

        Androids android = new Androids();

        android.getOS();
        android.getCall();
        android.getSms();
        android.getInternet();
        System.out.println();

        IPhones iphone = new IPhones();

        iphone.getOS();
        iphone.getCall();
        iphone.getSms();
        iphone.getInternet();
    }
}
