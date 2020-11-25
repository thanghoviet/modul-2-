package com.codegym;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //gọi phương thức thay đổi

        //tạo đối tượng
        Student s1 = new Student(111, "HuyAnh");
        Student s2 = new Student(222, "Thinh");
        Student s3 = new Student(333, "Son");

        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
