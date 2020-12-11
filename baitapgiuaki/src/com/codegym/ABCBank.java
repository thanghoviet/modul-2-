package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class ABCBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lichSu = new ArrayList<>();
        String name = "Nguyen Van A";
        int monney = 1200000;
        int choice;


        do {
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
                    int naptien = scanner.nextInt();
                    monney += naptien;
                    lichSu.add("Nap tien: " + naptien);
                    System.out.println("Giao dich thanh cong. Ban vua nap " + naptien + "thanh cong.");
                    System.out.println("So du tai khoan khach hang la:" + monney + "VND");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;
                case 3:
                    System.out.println("Giao dich Rut tien:");
                    System.out.println("Vui long nhap so tien:");
                    int ruttien = scanner.nextInt();
                    if (ruttien<monney){
                    monney -= ruttien;
                    lichSu.add("Rut tien: " + ruttien);
                        System.out.println("Giao dich thanh cong. Ban vua rut" + ruttien + "thanh cong.");
                        System.out.println("So du tai khoan khach hang la:" + monney + "VND");
                        System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    }else {
                        System.out.println("Ban ko du tien");
                        System.out.println("so tien hien tai cua ban la:"+monney+ " VND");
                    }

                    break;
                case 4:
                    System.out.println("lich su 3 lan hoat dong truoc");
                    int limit = Math.max(lichSu.size() - 3, 0);
                    for (int i = lichSu.size() - 1; i >= limit; i--) {
                        System.out.println(lichSu.get(i));
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai chuc nang\n" +
                            "Bam nut theo menu de tiep tuc giao dich\n");
            }

        } while (choice != 0);


    }


}
