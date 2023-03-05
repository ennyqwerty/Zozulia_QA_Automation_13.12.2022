package com.hillel.lessons.lesson12.abstractions;

public abstract class BottleProduct {

    private int volume;
    private  String design;
    private String manufacturer;
    private double grade;

    public BottleProduct(int volume, String design, String manufacturer, double grade) {
        this.volume = volume;
        this.design = design;
        this.manufacturer = manufacturer;
        setGrade(grade);
    }

    public int getVolume() {
        return volume;
    }

    public String getDesign() {
        return design;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getGrade() {
            return grade;
    }

    protected abstract Object getDescription();

    public void setGrade(double grade) {
        if (grade >= 0) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Градуси менше 0");
        }
    }

}
