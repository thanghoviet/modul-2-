package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2.Print the square triangle  :botton-left ");
        System.out.println("3. Print the square triangle :botton-right");
        System.out.println("4. Print the square triangle :top-left");
        System.out.println("5. Print the square triangle :top-right");
        System.out.println("6. Draw the triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        number = scanner.nextInt();

    while (number != 0){
    switch (number) {
        case 0:
            System.out.printf("Exit");
        case 1:
            System.out.println("Draw the rectangle");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            break;
        case 2:
            System.out.println("Draw the rectangle");
            System.out.println("*          ");
            System.out.println("* *        ");
            System.out.println("* * *      ");
            System.out.println("* * * * *  ");
            System.out.println("* * * * * *");
            break;
        case 3:
            System.out.println("Draw the rectangle");
            System.out.println("        *");
            System.out.println("      * *");
            System.out.println("    * * *");
            System.out.println("  * * * *");
            System.out.println("* * * * *");
            break;
        case 4:
            System.out.println("Draw the rectangle");
            System.out.println("* * * * *");
            System.out.println("* * * *  ");
            System.out.println("* * *    ");
            System.out.println("* *      ");
            System.out.println("*        ");
            break;
        case 5:
            System.out.println("Draw the rectangle");
            System.out.println("* * * * *");
            System.out.println("  * * * *");
            System.out.println("    * * *");
            System.out.println("      * *");
            System.out.println("        *");
            break;
        case 6:
            System.out.println("Draw the rectangle");
            System.out.println("* * * * *");
            System.out.println(" * * * * ");
            System.out.println("  * * *  ");
            System.out.println("   * *   ");
            System.out.println("    *    ");
            break;
        default:
            System.out.println("No choice!");
            break;

    }
    break;
    }
}
}
