package com.hillel.lessons.lesson14.homework16.autoshop;

import com.hillel.lessons.lesson14.homework16.abstractions.Items;
import com.hillel.lessons.lesson14.homework16.interfaces.FuelEleсtricity;

public final class Bike extends Items implements FuelEleсtricity {
     private String bikeType;

    public Bike(double price, String model, String makes, int years, String madeCountry, int maxSpeed, String bikeType) {
        super(price, model, makes, years, madeCountry, maxSpeed);
        this.bikeType = bikeType;
    }

    @Override
    public String getDescription() {
        return "Bike: " + " ціна - " + getPrice() +"$" + ", модель - " + getModel() + ", виробник - " + getMakes() + ", країна виробник - " + getMadeCountry()
                + ", максимальна швидкість - " + getMaxSpeed() + ", тип - " + bikeType;
    }

    @Override
    public void electricity() {
        System.out.println("ElektroBike:");

    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeType='" + bikeType + '\'' +
                '}';
    }
}
