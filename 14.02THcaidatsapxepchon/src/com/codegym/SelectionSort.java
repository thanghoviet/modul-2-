package com.codegym;

public class SelectionSort {
    static int[] list = {1, 9, 5, 6, 7, -4};

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (currentMin > list[k]) {
                    currentMin = list[k];
                    currentMinIndex = k;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
