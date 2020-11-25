package com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setColor("blue");
        circle.setRadius(3.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
    }

}
