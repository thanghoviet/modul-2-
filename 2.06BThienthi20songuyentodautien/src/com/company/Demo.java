package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        int so = scanner.nextInt();
        scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line1);
        System.out.println(so);
        System.out.println(line2);

    }
}
