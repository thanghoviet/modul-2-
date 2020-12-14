package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> sanpham = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        sanpham.add(new Product("daodao", 003, 345));
        sanpham.add(new Product("dao", 001, 123));
        sanpham.add(new Product("daohoa", 006, 789));
        sanpham.add(new Product("daomo", 002, 234));
        sanpham.add(new Product("daochau", 004, 456));
        sanpham.add(new Product("candao", 005, 567));
    }

    public void menu() {
        System.out.println("*************************");
        System.out.println("nhan phim de su dung");
        System.out.println("1.them san pham");
        System.out.println("2.sua thong tin san pham tho id");
        System.out.println("3.nhap id de xoa san pham");
        System.out.println("4.xem danh sach san pham");
        System.out.println("5.tim theo ten san pham");
        System.out.println("6.xap sep lai san pham theo muc gia");
        System.out.println("0.de thoat");
    }

    public void AddSP() {
        System.out.println("Them san pham");
        System.out.println("nhap ten SP:");
        String name = scanner.nextLine();
        System.out.println("nhap id SP");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gia SP");
        int price = getInteger();
        Product newProduct = new Product(name, id, price);
        sanpham.add(newProduct);
    }

    public void repairID() {
        System.out.println("nhap id san pham de sua thong tin:");
        int checkid =getInteger();
        for (int i = 0; i < sanpham.size(); i++) {
            Product sphienco = sanpham.get(i);
            if (checkid == sphienco.getId()) {
                System.out.println("sua ten SP:");
                sanpham.get(i).setName(scanner.nextLine());
                System.out.println("sau gia SP:");
                sanpham.get(i).setId(getInteger());
                return;
            }
        }
    }

    public void ClearID() {
        System.out.println("nhap id san pham de xoa thong tin:");
        int checkid = getInteger();
        for (int i = 0; i < sanpham.size(); i++) {
            Product sphienco = sanpham.get(i);
            if (checkid == sphienco.getId()) {
                sanpham.remove(i);
                return;
            }
        }
    }

    public void Display() {
        System.out.println("danh sach san pham la: ");
        for (int i = 0; i < sanpham.size(); i++) {
            System.out.println(sanpham);
            break;
        }
    }

    public void SearchName() {
        String checkName = scanner.nextLine();
        for (int i = 0; i < sanpham.size(); i++) {
            Product sphienco = sanpham.get(i);
            if (checkName == sphienco.getName()) {
                System.out.println(sanpham.get(i));
                return;
            }
        }
    }

    public void sort() {

        Comparator<Product> comparePriceAsc = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };

        sanpham.sort(comparePriceAsc);
        System.out.println(sanpham);
//        Comparator<Product> comparePriceDesc = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o2.getPrice() - o1.getPrice();
//            }
//        };
    }

    private int getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }
}
