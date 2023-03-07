package com.hillel.lessons.lesson15;

import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if(Objects.nonNull(name)){
        this.name = name;
    } else{
            System.out.println("Name can not be null  ");
        }

    }
}
