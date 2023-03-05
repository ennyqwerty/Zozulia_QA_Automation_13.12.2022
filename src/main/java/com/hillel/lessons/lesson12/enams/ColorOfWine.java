package com.hillel.lessons.lesson12.enams;

public enum ColorOfWine {
    RED("Red"),
    WHITE("White"),
    ROSE("Rose");

    private String color;

    ColorOfWine(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorOfWine{" +
                "color='" + color + '\'' +
                '}';
    }
}
