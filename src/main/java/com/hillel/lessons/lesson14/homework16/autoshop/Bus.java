package com.hillel.lessons.lesson14.homework16.autoshop;

import com.hillel.lessons.lesson14.homework16.abstractions.Items;

public class Bus extends Items {
    private int numberOfFloors;

    public Bus(double price, String model, String makes, int years, String madeCountry, int maxSpeed, int numberOfFloors) {
        super(price, model, makes, years, madeCountry, maxSpeed);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String getDescription() {
        return "Bus: " + " ціна - " + getPrice() + "$" + ", модель - " + getModel() + ", виробник - " + getMakes() + ", країна виробник - " + getMadeCountry()
                + ", максимальна швидкість - " + getMaxSpeed() + ", кількість поверхів - " + numberOfFloors;
    }
}
