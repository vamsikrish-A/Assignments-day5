package com.bridgelabz;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Nth Harmonic value:");
        int N = sc.nextInt();
        // H1 =1
        // H2 = H1 +1/2
        //H3 = H2 + 1/3
        // .
        // .
        // .
        // Hn = Hn-1 +1/n
        float h = 1;
        // Hn = H1 + H2 + H3 ....+ Hn-1 + 1/n
        for (int i=2; i <= N; i++) {
            h += (float)1 / i;
        }
        System.out.println("Nth Harmonic number is : " + h);
    }
}
