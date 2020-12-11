package com.codegym;

import java.util.Scanner;

public class ABCBank {
    public static void main(String[] args) {
    String name = "Nguyen Van A";
    double monney = 1200000;
    double naptien;
    double ruttien;
        int choice;


        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Nhan phim 1 de kiem tra tai khoan");
        System.out.println("Nhan phim 2 de nap tien");
        System.out.println("Nhan phim 3 de rut tien");
        System.out.println("Nhan phim 4 de xem lich su 3 lan");
        System.out.println("Nhan phim 0 de thoat");
        System.out.println("Nhap lua chon cua ban:  ");
        choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("So du tai khoan khach hang la:" + monney);
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;
                case 2:
                    System.out.println("Giao dich Nap tien : ");
                    System.out.println("Vui long nhap so tien:");
                    naptien = scanner.nextInt();
                    System.out.println("Giao dich thanh cong. Ban vua nap "+naptien+ "thanh cong.");
                    System.out.println("So du tai khoan khach hang la:" + Sotiensaukhinap(naptien,monney) + "VND");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;
                case 3:
                    System.out.println("Giao dich Rut tien:");
                    System.out.println("Vui long nhap so tien:");
                    ruttien=scanner.nextInt();
                    System.out.println("Giao dich thanh cong. Ban vua rut"+ruttien + "thanh cong.");
                    System.out.println("So du tai khoan khach hang la:"+ Sotiensaukhirut(ruttien,monney)+"VND" );
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;
                case 4:
                    System.out.println("lich su 3 lan hoat dong truoc");
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai chuc nang\n" +
                            "Bam nut theo menu de tiep tuc giao dich\n");
                    break;
            }

        } while (choice!= 0);


    }
    public static double Sotiensaukhinap(double naptien,double monney) {
        double sotiensaukhinap =naptien + monney;
        return sotiensaukhinap;
    }
    public static Object Sotiensaukhirut(double ruttien,double monney) {
        if (monney<ruttien){
            return "so tien khong du"+
                    "so tien con lai cua khach hang la:"+monney;

        }else {
            double sotiensaukhirut = monney - ruttien;
            return sotiensaukhirut;
        }
    }


}
