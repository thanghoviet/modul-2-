package com.codegym;

public class Triangle {
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    public Triangle(int i, int i1, int i2, String blue) {

    }

    public Triangle() {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return Math.sqrt(((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2))/4);
    }
    public double getPerimeter(){
        return this.side3 + this.side2 + this.side1;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
