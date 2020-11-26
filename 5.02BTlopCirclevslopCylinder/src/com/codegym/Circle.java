package com.codegym;

public class Circle {
    public double radius= 5;
    public String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "area :" + getArea();
    }
}
