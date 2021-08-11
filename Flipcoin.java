package com.bridgelabz;

import java.util.Scanner;

public class Flipcoin {
        public static void main(String[] args) {
        int count = 0;
        double result;
        int countHead = 0;
        int countTail = 0;
        Scanner myobj = new Scanner(System.in);
        int num_of_Count = myobj.nextInt();

        while (count < num_of_Count) {
            result = Math.random();
            if (result <= 0.5) {
                System.out.println("Head");
                countHead += 1;
            } else {
                System.out.println("Tails");
                countTail += 1;
            }
            count += 1;
        }
        double p_Head = ((countHead * 100)/count);
        double p_tail = ((countTail * 100)/count);
        System.out.println("Percentage of Head: " + p_Head);
        System.out.println("Percentage of Tail: "  + p_tail);
    }

}
