package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("vi tri muon them:");
        int vitri = scanner.nextInt();
        System.out.println("gia tri muon them:");
        int giatri = scanner.nextInt();

        System.out.println("Before: " + Arrays.toString(numbers));

        int bientam = numbers[vitri];
        numbers[vitri] = giatri;
         for (int i = vitri + 1; i < size; i++) {
            int bienrong = numbers[i];
            numbers[i] = bientam;
            bientam = bienrong;
        }
        System.out.println("number");
        System.out.println("After: " + Arrays.toString(numbers));
    }
}