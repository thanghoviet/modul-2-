package CleancodeOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckYourMoney {
    User abcBank = new User("Nguyen van A", 120000);
    ArrayList<String> lichSu = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void Menu(){
        System.out.println("==============");
        System.out.println("Menu");
        System.out.println("Nhan phim A de kiem tra tai khoan");
        System.out.println("Nhan phim B de nap tien");
        System.out.println("Nhan phim C de rut tien");
        System.out.println("Nhan phim D de xem lich su 3 lan");
        System.out.println("Nhan phim X de thoat");
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
        abcBank.setMoney(abcBank.getMoney() + naptien);
        lichSu.add("Nap tien: " + naptien);
        System.out.println("Giao dich thanh cong. Ban vua nap " + naptien + "thanh cong.");
        System.out.println("So du tai khoan khach hang la:" + abcBank.getMoney() + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
    }

    public void Withdrawal() {
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        int ruttien = scanner.nextInt();
        if (ruttien <= abcBank.getMoney()) {
            abcBank.setMoney(abcBank.getMoney() - ruttien);
            lichSu.add("Rut tien: " + ruttien);
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
        int limit = Math.max(lichSu.size() - 3, 0);
        for (int i = lichSu.size() - 1; i >= limit; i--) {
            System.out.println(lichSu.get(i));
        }
    }

}
