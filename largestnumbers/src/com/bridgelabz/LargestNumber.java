package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    static  void largestThreeNumbers(int a, int b, int c) {
        if (a > b && a > c){
            System.out.println(+a +" is largest number among three");
        }
        else if (b > a && b > c)
            System.out.println(+b +" is largest number among three numbers");
        else
            System.out.println(+c +" is largest number among three numbers.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three numbers::");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        largestThreeNumbers(a, b, c);

    }
}
