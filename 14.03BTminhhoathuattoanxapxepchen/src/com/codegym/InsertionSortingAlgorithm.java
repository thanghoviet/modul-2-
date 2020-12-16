package com.codegym;

import java.util.Scanner;



public class InsertionSortingAlgorithm {
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
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.println("Swap " + list[k] + " with " + list[k + 1]);
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.print("List after the '" + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(" " + list[i]);
    }
}

