package com.codegym;

public class MyStack {
    public int[] arr;
    int size;
    int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public  static class StackClient {
        public static void main(String[] as) throws Exception {
            MyStack stack = new MyStack(5);

            stack.push(5);
            stack.push(4);
            stack.push(3);
            stack.push(2);
            stack.push(1);

            System.out.println("1. Size of stack after push operations: " + stack.size());
            System.out.printf("2. Pop elements from stack : ");

            while (!stack.isEmpty()) {
                System.out.printf(" %d", stack.pop());
            }
        }
    }
}