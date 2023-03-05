package com.hillel.lessons.lesson14.homework16.autoshop;

import com.hillel.lessons.lesson14.homework16.abstractions.Items;
import com.hillel.lessons.lesson14.homework16.enams.ColorItems;

public class Car extends Items {
    private  String type;
    private int numberOfDoors;

    private ColorItems color;


    public Car(double price, String model, String makes, int years, String madeCountry, int maxSpeed, String type, int numberOfDoors, ColorItems color) {
        super(price, model, makes, years, madeCountry, maxSpeed);
        this.type = type;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Car: " + " ціна - " + getPrice() +"$" + ", виробник - " + getMakes() + ", країна виробник - " + getMadeCountry()
                + ", тип - " + type + ", кількість дверей - " + numberOfDoors + ", колір - " + color.getColor()
                + ", рік випуску - " + getYears();
    }

    @Override
    public String toString() {
        return "Car: " + " ціна - " + getPrice() +"$" + ", модель - " + getModel() + ", виробник - " + getMakes() + ", країна виробник - " + getMadeCountry()
                + ", максимальна швидкість - " + getMaxSpeed() + ", тип - " + type + ", кількість дверей - " + numberOfDoors + ", колір - " + color.getColor()
                + ", рік випуску - " + getYears();
    }
}
