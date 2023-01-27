package com.hillel.lessons.lesson11.homework13;

public class Androids implements SmartPhones, LinuxOS{
    //    //Зробіть класи, які його імплементують: Androids, iPhones.
    //    //
    //    //Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати IOS
    @Override
    public void getOS() {
        System.out.println("Android");
    }

    @Override
    public void getCall() {
        System.out.println("Дзвінок");
    }

    @Override
    public void getSms() {
        System.out.println("Повідомлення");

    }

    @Override
    public void getInternet() {
        System.out.println("Інтернет");
    }
}
