package com.bridgelabz;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Given number is an Even number " +number);
        }
        else {
            System.out.println("Given number is an Odd number " +number);
        }
    }
}
