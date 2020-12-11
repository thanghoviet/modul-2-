package com.codegym;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] prime={1,2,3,4,5,6,7,8,9};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <prime.length; i++) {
            stack.push(prime[i]);
        }
        for (int i = 0; i <prime.length ; i++) {
            prime[i]=stack.pop();
        }
//        int i= 0;
//        while (!stack.isEmpty()) {
//            prime[i]=stack.pop();
//            i++;

        System.out.println(Arrays.toString(prime));
    }
}
