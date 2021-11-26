package com.company;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        //Define a method that returns the product of two numbers entered by user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num_2 = input.nextInt();
        System.out.println("The product:  " + product(num_1,num_2));
    }

    private static int product(int num_1, int num_2) {
        return num_1 * num_2;
    }
}
