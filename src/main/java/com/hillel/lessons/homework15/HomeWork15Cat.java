package com.hillel.lessons.homework15;

public class HomeWork15Cat {
    public static void main(String[] args) {
        HomeWork15Cat cat = new HomeWork15Cat();

        cat.sayMeow();
        cat.setName("Cat");
        cat.setAge(0);
        cat.setWeight(1);
    }

    private String name;
    private int age;
    private int weight;

    public HomeWork15Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public HomeWork15Cat() {
    }

    public void sayMeow() {
        System.out.println("Мяу");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Імя кота " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            System.out.println("Вік кота " + age);
        } else {
            System.out.println("Помилка, некоректний вік кота");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
            System.out.println("Вага кота " + weight);
        } else {
            System.out.println("Помилка, некоректна вага кота");
        }
    }
}
