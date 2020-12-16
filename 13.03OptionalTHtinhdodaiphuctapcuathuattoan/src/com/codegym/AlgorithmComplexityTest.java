package com.codegym;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = scanner.nextLine();

        int[] frequentChar = new int[225];
        for (int i = 0; i < string.length(); i++) {
            int ascii = string.charAt(i);
            //   25        'o'
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char charater = (char) 225;
        //      'z'              225
        for (int j = 0; j < 225; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                charater = (char) j;//doi vi tri i->chu(string)theo bang ma ascii
                System.out.println(j);
            }
        }
        System.out.println("The most appearing letter is '"
                + charater + "' with a frequency of "
                + max + " times");
    }
}
