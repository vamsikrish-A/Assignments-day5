package com.bridgelabz;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3}, {3, 4, 5}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++ ){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
