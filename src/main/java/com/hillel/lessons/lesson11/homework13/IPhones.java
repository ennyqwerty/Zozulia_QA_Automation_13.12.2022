package com.hillel.lessons.lesson11.homework13;

public class IPhones implements SmartPhones, IOS{

    @Override
    public void getOS() {
        System.out.println("IOS");
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
