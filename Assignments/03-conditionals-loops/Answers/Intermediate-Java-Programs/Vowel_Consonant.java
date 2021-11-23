package com.company;

import java.util.Scanner;

public class Vowel_Consonant {
    //Java Program Vowel Or Consonant
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char ch = input.next().trim().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
