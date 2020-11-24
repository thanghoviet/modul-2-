package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myList = {10, 4, 5, 4, 8, 9, 15, 25};
        int min1 = 0;


        for (int i = 0; i < myList.length; i++) {
            if (i == 0) {
                min1 = myList[0];
            } else if (myList[i] < min1) {
                min1 = myList[i];
            }
        }
        int min2 = myList[0];
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] < min2 && min1 < myList[j]) {
                min2 = myList[j];
            }
        }
        System.out.println(min2);
    }
}
