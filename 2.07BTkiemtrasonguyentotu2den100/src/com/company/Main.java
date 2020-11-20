package com.company;

public class Main {

    public static void main(String[] args) {

        for (int number = 2; number <= 100 ; number++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(number);
        }
    }
}
