package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number::");
        int number = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter a divisor::");
        int divisor = sc.nextInt();

        // Quotient
        double quotient;
        quotient = number/divisor;
        System.out.println("Quotient of a given number- " + quotient);

        // Remainder
        double remainder;
        remainder = number%divisor;
        System.out.println("Remainder for the given number- "+remainder);
    }

}
