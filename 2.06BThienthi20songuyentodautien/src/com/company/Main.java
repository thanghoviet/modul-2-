package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 10;
        double count = 0;
        int N ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao N so nguen to :");
        N = scanner.nextInt();

        if (N>1)
        {
            System.out.print( N + " Số nguyên tố đầu tiên là:");
            System.out.println(2);

        }
        for ( int i = 2 ; i <=N ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(number) ; j++ )
            {
                if ( number%j == 0 )
                {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 )
            {
                System.out.println(number);
                i++;
            }
            count = 1;
            number++;
        }
    }
}
