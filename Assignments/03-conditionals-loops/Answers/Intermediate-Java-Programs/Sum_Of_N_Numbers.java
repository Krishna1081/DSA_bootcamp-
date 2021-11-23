package com.company;

import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the nth number: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            sum += number;
        }
        System.out.println("Sum of " + n +" numbers is: " + sum);
    }
}
