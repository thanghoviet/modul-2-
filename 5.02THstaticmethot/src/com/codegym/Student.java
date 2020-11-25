package com.codegym;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    //hàm tạo để khởi tạo biến
    Student(int iid, String n) {
        id = iid;
        name = n;
    }

    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    //phương pháp hiển thị giá trị
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}