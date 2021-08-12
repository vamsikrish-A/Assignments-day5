package com.bridgelabz;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter power value: " );
        int N = value.nextInt();
        int i = 0;
        for(i=0; i<=N; i++){
            double result = Math.pow(2, i);
            System.out.println("power of two" + result);
        }


    }



}
