package com.company;

import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        // Number palindrome
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int reverse = 0;
        int temp = number;
        while (temp != 0){
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder ;
            temp /= 10;
        }if (reverse == number){
            System.out.println("palindrome");
        }if (reverse != number){
            System.out.println("Not Palindrome");
        }
    }
}
