package com.company;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        //Sum Of A Digits Of Number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0){
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("Sum Of The Digits Of A Number: " + sum);
    }
}
