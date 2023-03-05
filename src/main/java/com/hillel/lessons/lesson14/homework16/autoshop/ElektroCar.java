package com.hillel.lessons.lesson14.homework16.autoshop;

import com.hillel.lessons.lesson14.homework16.enams.ColorItems;
import com.hillel.lessons.lesson14.homework16.interfaces.FuelEleсtricity;

public class ElektroCar extends Car implements FuelEleсtricity {
    public ElektroCar(double price, String model, String makes, int years, String madeCountry, int maxSpeed, String type, int numberOfDoors, ColorItems color) {
        super(price, model, makes, years, madeCountry, maxSpeed, type, numberOfDoors, color);
    }

    @Override
    public void electricity() {
        System.out.println("ElektroCar:" +"тип паллива електроенергія");
    }

}
