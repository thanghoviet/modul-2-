package com.codegym;

public class Car {
    private String name;

    private String engine;
    private String color;



    public static int numberOfCars;



    public Car(String name, String engine,String color) {

        this.name = name;
        this.engine = engine;
        this.color = color;

        numberOfCars++;

    }
}
