package Cleancode2OOP;

import CleancodeOOP.CheckYourMoney;

import java.util.Scanner;

public class ATMMachineTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckYourMoney check = new CheckYourMoney();
        String name = "Nguyen Van A";
        int monney = 1200000;
        int choice;
        do {
            check.Menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    check.CheckMonney();
                    break;
                case 2:
                    check.Payment();
                    break;
                case 3:
                    check.Withdrawal();
                    break;
                case 4:
                    check.History();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai chuc nang" +
                            "Bam nut theo menu de tiep tuc giao dich");
            }
        } while (choice != 0);
    }
}

