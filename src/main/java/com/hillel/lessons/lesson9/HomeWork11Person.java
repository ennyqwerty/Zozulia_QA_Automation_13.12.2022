package com.hillel.lessons.lesson9;

public class HomeWork11Person {
    //    Зробити клас Person та в ньому метод personInfo()
    //    На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
    //    Всередині методу формувати рядок у форматі:
    //    Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
    //    Метод має повертати String
    //    У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
    //    Повинен вийти висновок такого типу:
    //    Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
    //    Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
    //    Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.

    public static void main(String[] args) {
        System.out.println(personInfo("Will", " Smith", "New York", 2936729462846L));
        System.out.println(personInfo("Jackie", " Chan", "Shanghai", 12312412412L));
        System.out.println(personInfo("Sherlock", "Holmes", "London", 37742123513L));
    }

    static String personInfo(String name, String lastname, String town, long phone) {
        return "Зателефонувати громадянинові " + name + lastname + " з міста " + town + " можна за номером " + phone;
    }
}
