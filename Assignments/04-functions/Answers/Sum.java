package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num_2 = input.nextInt();
        System.out.println("The sum:  " + sum(num_1,num_2));
    }

    private static int sum(int num_1, int num_2) {
        return num_1 + num_2;
    }
}
