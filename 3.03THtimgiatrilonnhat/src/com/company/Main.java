package com.company;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a size: ");
            size = scanner.nextInt();

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("số lớn nhất la :" + max + " ,trong " + index + " so");
    }
}


