package com.hillel.lessons.lesson14.main;

import com.hillel.lessons.lesson14.homework16.autoshop.Bike;
import com.hillel.lessons.lesson14.homework16.autoshop.Bus;
import com.hillel.lessons.lesson14.homework16.autoshop.Car;
import com.hillel.lessons.lesson14.homework16.autoshop.ElektroCar;
import com.hillel.lessons.lesson14.homework16.enams.ColorItems;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2000,"Tiguan","Volkswagen", 2022, "Germany",190,"позашляховик",5,
                ColorItems.BLACK);
        System.out.println(car.getDescription());
        System.out.println(car);
        System.out.println();

        ElektroCar elektroCar = new ElektroCar(1500,"Leaf", "Nissan", 2015,"Japan",150,"лімузин",5,
        ColorItems.GREEN);
        elektroCar.electricity();
        System.out.println(elektroCar);
        System.out.println();

        Bus bus = new Bus(15000,"4212 Maral", "Scania", 2021,"Sweden", 110, 2);
        System.out.println(bus.getDescription());
        System.out.println();

        Bike bike = new Bike(200,"RM-Z450", "Suzuki", 2019,"Japan", 300, "мотоцикл" );
        bike.electricity();
        System.out.println(bike.getDescription());
        System.out.println(bike);


    }
}
