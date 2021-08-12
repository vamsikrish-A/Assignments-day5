package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
    static void Vowel_or_Consonant(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U' )
            System.out.println("It's a Vowel.");
        else
            System.out.println("It is a consonant.");
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Alphabet::");
        String str = sc.next();
        char alphabet = str.charAt(0);
        Vowel_or_Consonant(alphabet);

    }


    }

