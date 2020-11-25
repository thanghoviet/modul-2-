package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3","red");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6","blue");

        System.out.println(Car.numberOfCars);

    }
}
