package com.bridgelabz;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int x, y, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers::");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("numbers before Swapping:x=" +x+"y=" +y);

        //Swapping
         s = x;
         x = y;
         y = s;

        System.out.println("numbers after Swapping:x=" +x+"y=" +y);


    }
}
