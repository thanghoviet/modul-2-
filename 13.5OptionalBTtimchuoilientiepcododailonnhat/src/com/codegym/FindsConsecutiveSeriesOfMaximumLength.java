package com.codegym;

import java.util.LinkedList;
import java.util.Scanner;

public class FindsConsecutiveSeriesOfMaximumLength {
    public static void main(String[] args) {
        LinkedList<Character> max=new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string=scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
        LinkedList<Character> list=new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
            if (string.charAt(i)>list.getLast()) {
            break;}
                list.add(string.charAt(j));
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (int i = 0; i < max.size(); i++) {
        Character ch = max.get(i);
        System.out.print(ch);
        }
        System.out.println();
    }
}
