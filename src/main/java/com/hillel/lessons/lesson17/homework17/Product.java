package com.hillel.lessons.lesson17.homework17;

public class Product {
    //Вам нужно сделать 2 класса :
    //
    //
    //    Продукт - в нем должно быть поля Название и Цена
    //    ProductMarket - там должен быть поле список продуктов(инициализируется через конструктор)
    //
    //Вам нужно будет : в класс ProductMarket добавить несколько методов :
    //
    //
    //
    //    Вернуть все имена продуктов
    //    Вернуть все имена по алфавиту
    //    Вернуть все цены больше 10
    //    Вернуть все цены меньше 5
    //    Вернуть цены как стринг
    //
    //Обратите внимание, в мейне вы будете работать с ProductMarket
     private String name;
     private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
