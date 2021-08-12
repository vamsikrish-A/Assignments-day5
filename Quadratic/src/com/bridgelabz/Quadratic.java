package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // roots of eq

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input values to find roots::");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double delta;
        delta = (b*b-(4*a*c));



        double x = (-b + Math.sqrt(delta))/(2*a);
        double y = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("Roots of given Quadratic equation are x="+ x +" y="+ y);

    }

}
