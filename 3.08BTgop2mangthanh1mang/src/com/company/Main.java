package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr12 = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr1.length; j++) {
            arr12[j] = arr1[j];
        }

        int j = 0;
        for (int i = arr1.length; i < arr12.length; i++) {
            arr12[i] = arr2[j];
            j++;
        }
        System.out.print("mang gop lai la:" + Arrays.toString(arr12));
    }
}
