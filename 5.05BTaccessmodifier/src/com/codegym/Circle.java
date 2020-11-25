package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double r){
    this.radius=r;

    }

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
}
