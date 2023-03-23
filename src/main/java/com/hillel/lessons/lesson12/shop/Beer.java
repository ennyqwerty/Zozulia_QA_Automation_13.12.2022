package com.hillel.lessons.lesson12.shop;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.interfaces.Bubbling;

import java.util.Objects;

public final class Beer extends BottleProduct implements Bubbling {
    private String beerType;

    public Beer(String productName, int volume, String design, String manufacturer, double grade, String beerType) {
        super(productName, volume, design, manufacturer, grade);
        this.beerType = beerType;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    @Override
    public String getDescription() {
        return "Beer: " + getDesign() + " , with type: " + beerType;
    }

    @Override
    public void bubbling() {
        System.out.println("Beer:" + beerType + " піниться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return Objects.equals(beerType, beer.beerType) && Objects.equals(getVolume(), beer.getVolume())
                && Objects.equals(getProductName(), beer.getProductName())
                && Objects.equals(getManufacturer(), beer.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(beerType);
    }

    @Override
    public String toString() {
        return "Beer{" +
                "beerType='" + beerType + '\'' +
                '}';
    }
}
