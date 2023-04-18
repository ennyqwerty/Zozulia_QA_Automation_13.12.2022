package com.hillel.lessons.lesson18;

import java.util.Comparator;

public class Player implements Comparable<Player> {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Player i) {
        return name.compareTo(i.getName());
    }
}
