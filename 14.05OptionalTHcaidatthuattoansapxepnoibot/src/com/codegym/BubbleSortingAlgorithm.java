package com.codegym;

import java.util.Scanner;

public class BubbleSortingAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHAP SIZE:");
        int size = scanner.nextInt();
        int[] list = new int[size];
//        System.out.println("NHAP " + list.length + " SO:");

        for (int i = 0; i < list.length; i++) {
            System.out.println("số thứ " + (i + 1) + ":");
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
        System.out.println("\n"+"sau khi sap xep:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }

}
