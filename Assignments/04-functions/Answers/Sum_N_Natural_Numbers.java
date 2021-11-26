package com.company;

import java.util.Scanner;

public class Sum_N_Natural_Numbers {
    public static void main(String[] args) {
        sum();
    }

    private static void sum() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int number = input.nextInt();
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
    }
}
