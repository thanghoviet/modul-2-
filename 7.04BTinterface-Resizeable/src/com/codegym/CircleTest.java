package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle);
        circle.resize();
        System.out.println(circle);
        circle.getArea();
        System.out.println(circle.getArea());
        circle.getPerimeter();
        System.out.println(circle.getPerimeter());
    }
}
