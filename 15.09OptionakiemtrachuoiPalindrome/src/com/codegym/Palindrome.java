package com.codegym;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String palin,drome="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra:");
        palin = scanner.nextLine();
        int n=palin.length();
        for (int i = n-1; i >=0 ; i--) {
            drome+=palin.charAt(i);
        }
        if(palin.equalsIgnoreCase(drome))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}

