package com.hillel.lessons.lesson15;

import java.io.IOException;
import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) throws IOException {
        if(Objects.nonNull(name)){
        this.name = name;
    } else{
            throw new IOException();
            //System.out.println("Name can not be null  ");
        }

    }
}
