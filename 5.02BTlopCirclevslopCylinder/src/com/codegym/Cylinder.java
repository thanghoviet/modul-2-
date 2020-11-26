package com.codegym;

public class Cylinder extends Circle {
    private double hieght = 6;

    public Cylinder(){

    }
    public double getVolume(){
    return getArea()*hieght;
    }
    @Override
    public String toString(){
    return "A Volume:" + getVolume();
    }

}
class Cylindertest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Area :"+cylinder.getArea());

    }
}

