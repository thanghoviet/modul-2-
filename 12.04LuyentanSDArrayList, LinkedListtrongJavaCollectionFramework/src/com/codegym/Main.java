package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManager lestgo=new ProductManager();
        int choice;
        do{
            lestgo.menu();
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    lestgo.AddSP();
                    break;
                case 2:
                    lestgo.repairID();
                    break;
                case 3:
                    lestgo.ClearID();
                    break;
                case 4:
                    lestgo.Display();
                    break;
                case 5:
                    lestgo.SearchName();
                case 6:
                    lestgo.sort();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}
