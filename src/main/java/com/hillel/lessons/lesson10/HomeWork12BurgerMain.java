package com.hillel.lessons.lesson10;

public class HomeWork12BurgerMain {
    //1.Зробити клас Burger, який матиме поля:булочка, м'ясо, сир, зелень, майонез
    //2.Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
    //    a.звичайний бургер (усі компоненти)
    //    b.дієтичний бургер (без майонезу)
    //    c.вегетеріанський (без мя'са)
    //3.У кожен конструктор додати виведення в консоль складу даного варіанту бургера (при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
    //4.Зробити клас BurgerMain, в якому створити три різні бургери. Їхній склад буде автоматично виводитися на екран під час запуску програми.
    public static void main(String[] args) {
        System.out.println(new HomeWork12Burgers(2, "булка", "сир","зелень", "майонез"));
        System.out.println();
        System.out.println(new HomeWork12Burgers(1, "булка", "сир","зелень"));
        System.out.println();
        System.out.println(new HomeWork12Burgers("булка", "сир","зелень", "майонез"));

    }
}
