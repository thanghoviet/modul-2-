package com.codegym;

import java.util.Scanner;

public class InsertionSortingAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHAP SIZE:");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("số thứ " + (i + 1) + ":");
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
    }
    }
