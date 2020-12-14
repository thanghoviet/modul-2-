package test2;

import java.util.Scanner;

public class ATMMachine {
    BankAccount abcBank = new BankAccount("Nguyen van A", 120000);
    Scanner scanner = new Scanner(System.in);

    public void Menu() {
        System.out.println("==============");
        System.out.println("Menu");
        System.out.println("Nhan phim 1 de kiem tra tai khoan");
        System.out.println("Nhan phim 2 de nap tien");
        System.out.println("Nhan phim 3 de rut tien");
        System.out.println("Nhan phim 4 de xem lich su 3 lan");
        System.out.println("Nhan phim 0 de thoat");
        System.out.println("Nhap lua chon cua ban:  ");

    }

    public void CheckMonney() {
        System.out.println("So du tai khoan khach hang la:" + abcBank.getMoney());
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("==============");
    }

    public void Payment() {
        System.out.println("Giao dich Nap tien : ");
        System.out.println("Vui long nhap so tien:");
        int naptien = scanner.nextInt();
        abcBank.setMoneyadd(naptien);
        System.out.println("Giao dich thanh cong. Ban vua nap " + naptien + "thanh cong.");
        System.out.println("So du tai khoan khach hang la:" + abcBank.getMoney() + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
    }

    public void Withdrawal() {
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        int ruttien = scanner.nextInt();
        if (ruttien <= abcBank.getMoney()) {
            abcBank.setMoneyclear(ruttien);
            System.out.println("Giao dich thanh cong. Ban vua rut" + ruttien + "thanh cong.");
            System.out.println("So du tai khoan khach hang la:" + abcBank.getMoney() + "VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
        } else {
            System.out.println("Ban ko du tien");
            System.out.println("so tien hien tai cua ban la:" + abcBank.getMoney() + " VND");
        }
    }

    public void History() {
        System.out.println("lich su 3 lan hoat dong truoc");
        abcBank.historyAccount();
    }


}
