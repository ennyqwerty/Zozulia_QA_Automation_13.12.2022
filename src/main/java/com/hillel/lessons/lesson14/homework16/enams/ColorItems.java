package com.hillel.lessons.lesson14.homework16.enams;

public enum ColorItems {
    BLACK("Black"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue");

    private String color;

    ColorItems(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorItems{" +
                "color='" + color +
                '}';
    }
}
