package com.hillel.lessons.lesson12.abstractions;

public abstract class BottleProduct {
    private String productName;
    private int volume;
    private  String design;
    private String manufacturer;
    private double grade;

    public BottleProduct(String productName, int volume, String design, String manufacturer, double grade) {
        this.productName = productName;
        this.volume = volume;
        this.design = design;
        this.manufacturer = manufacturer;
        setGrade(grade);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public abstract Object getDescription();

    public void setGrade(double grade) {
        if (grade >= 0) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Градуси менше 0");
        }
    }

}
