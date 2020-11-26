package com.codegym;

import java.util.Map;

public class MoveablePoint {
    float xSpeed=0.01f;
    float ySpeed=0.01f;

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){

    }
    public MoveablePoint(float xSpeed,float ySpeed){

    }
    public MoveablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void getSpeed(float xSpeed,float ySpeed){

    }
    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

}
class Pointtest{
    public static void main(String[] args) {
        Point point= new Point();
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(point);
        System.out.println(moveablePoint);

    }
}
