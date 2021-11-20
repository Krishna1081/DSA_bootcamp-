package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //5. Take 2 numbers as input and print the largest number
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the first number");
        int num_1 = input.nextInt();
        System.out.print("Enter the second number");
        int num_2 = input.nextInt();

        int max = Math.max(num_1, num_2);
        System.out.println("Largest number: " + max);
    }
}