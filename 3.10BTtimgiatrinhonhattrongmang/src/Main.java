package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int min=arr[0][1];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("số lớn nhất trong mảng là:"+min);
    }
}
