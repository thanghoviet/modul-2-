package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Value to remove:");
        int remove = scanner.nextInt();

        System.out.println("Before: " + Arrays.toString(numbers));
        int offset = 0;
        for (int i = 0; i < size; i++) {
            do {
                if (numbers[i] == remove) offset++;
//                nếu giá trị cần xóa bằng giá trị trong mảng và lớn sơn số phần tử trong mảng ta gán nó =0
                numbers[i] = i + offset < size ? numbers[i + offset] : 0;
            } while (numbers[i] == remove);
        }

        System.out.println("After: " + Arrays.toString(numbers));
    }
}