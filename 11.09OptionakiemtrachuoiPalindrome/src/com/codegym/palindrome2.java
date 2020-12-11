package com.codegym;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Queue<Character> queue= new LinkedList<>();
        String palin= "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra:");
        palin = scanner.nextLine();
        int n=palin.length();
        for (int i = n-1; i >=0 ; i--) {
            queue.add(palin.charAt(i));
        }
        for (int i = 0; i <n-1 ; i++) {
           if (palin.charAt(i)!=queue.remove()){
               System.out.println("ko phaiu");
           }
        }
        System.out.println("La chuoi para");
    }
}
