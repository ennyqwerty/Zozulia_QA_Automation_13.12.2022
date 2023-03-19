package com.hillel.lessons.lesson12.anonymclass;

import com.hillel.lessons.lesson12.abstractions.BottleProduct;
import com.hillel.lessons.lesson12.interfaces.Bubbling;

public class AnonymClass {
    public static void main(String[] args) {

        BottleProduct bottleProduct = new BottleProduct("name",1,"cool design","UK",21) {

            private int price;
            @Override
            public Object getDescription() {
                return "NoNameProduct";
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        };

        printDesign(bottleProduct);
    }

    Bubbling b = new Bubbling() {
        @Override
        public void bubbling() {

        }
    };

    public static void printDesign(BottleProduct bottleProduct) {
        System.out.println(bottleProduct.getDescription());
    }
}
