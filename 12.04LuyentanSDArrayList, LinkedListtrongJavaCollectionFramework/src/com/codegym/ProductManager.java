package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> sanpham = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public void AddSP() {
        System.out.println("Them san pham");
        System.out.println("nhap ten SP:");
        String name = scanner.nextLine();
        System.out.println("nhap id SP");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gia SP");
        int price = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(name, id, price);
        sanpham.add(newProduct);
    }

    public void repair() {
        System.out.println("nhap id san pham de sua thong tin:");

    }

}
