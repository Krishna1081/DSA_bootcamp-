package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("The number is a " + palindrome(number));
    }

    private static String palindrome(int number) {
        int x = number;
        int reverse = 0;
        while (x != 0){
            int remainder = x % 10;
            reverse = reverse * 10 + remainder ;
            x = x / 10;
        }if (reverse == number){
            return "Palindrome";
        }
        return "Not A Palindrome";
    }
}
