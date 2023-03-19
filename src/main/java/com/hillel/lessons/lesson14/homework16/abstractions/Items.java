package com.hillel.lessons.lesson14.homework16.abstractions;

import com.hillel.lessons.lesson14.homework16.interfaces.FuelElectricity;

public abstract class Items implements FuelElectricity {
    private double price;
    private String model;

    private String makes;
    private int years;
    private String madeCountry;

    private int maxSpeed;


    public Items(double price, String model, String makes, int years, String madeCountry, int maxSpeed) {
        this.price = price;
        this.model = model;
        this.makes = makes;
        this.years = years;
        this.madeCountry = madeCountry;
        setMaxSpeed(maxSpeed);
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getMakes() {
        return makes;
    }

    public int getYears() {
        return years;
    }

    public String getMadeCountry() {
        return madeCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
            System.out.println("Швидкість менше  0");
        }
    }

    protected abstract Object getDescription();
}
