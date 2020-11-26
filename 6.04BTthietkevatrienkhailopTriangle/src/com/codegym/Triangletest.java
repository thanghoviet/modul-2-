package com.codegym;

public class Triangletest {
    public static void main(String[] args) {
        Triangle trys = new Triangle();
        System.out.println(trys);

        trys = new Triangle(3, 4, 5, "red");
        System.out.println(trys.getArea());
        System.out.println(trys.getPerimeter());

        trys.setSide1(20);
        trys.setSide2(30);
        trys.setSide3(40);
        System.out.println(trys);
    }
}
