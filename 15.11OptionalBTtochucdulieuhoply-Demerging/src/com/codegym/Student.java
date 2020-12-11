package com.codegym;

import java.util.ArrayList;

public class Student {
    String name = "";
    int age;
    boolean isMen = true;

    public Student() {

    }

    public Student(String name, int age, boolean isMen) {
        this.name = name;
        this.age = age;
        this.isMen = isMen;
    }

    @Override
    public String toString() {
        return name ;
    }
}
