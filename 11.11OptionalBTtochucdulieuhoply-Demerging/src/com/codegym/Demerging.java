package com.codegym;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {

    public static void main(String[] args) {
        Student HS1 = new Student("Thang", 22, true);
        Student HS2 = new Student("Thuy", 23, false);
        Student HS3 = new Student("Lap", 24, true );
        Student HS4 = new Student("Thy", 25, false);
        Student HS5 = new Student("Tam", 26,true);
        Student HS6 = new Student("Linh",27,false);
        Student HS7 = new Student("DuyAnh",28,true);
        Student HS8 = new Student("Khanh",29,true);
        Student HS9 = new Student("Trang",30,false);
        Student[] arr = new Student[]{HS1, HS2, HS3, HS4, HS5, HS6, HS7, HS8, HS9};
        Queue<Student> NAM= new LinkedList<>();
        Queue<Student> NU= new LinkedList<>();

        for (int i = 0; i <arr.length; i++) {
            Student thisStudent = arr[i];
            if (thisStudent.isMen){
                NAM.add(thisStudent);
            } else{
                NU.add(thisStudent);
            }
        }
        ArrayList<Student> output=new ArrayList<>();
        while (!NU.isEmpty()) {
            output.add(NU.remove());
        }
        while (!NAM.isEmpty()){
            output.add(NAM.remove());
        }

        System.out.println(output);
    }
}

