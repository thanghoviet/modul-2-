package com.codegym;


public class Point3D extends Point2D {
    float z = 0.01f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {

    }

    public float[] getXYZ() {
        return new float[]{this.x, this.y, this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
class Pointtest{
    public static void main(String[] args) {
        Point3D point= new Point3D();
        System.out.println(point);

    }
}