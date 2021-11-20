package com.company;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        //3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        float principal = input.nextFloat();

        System.out.print("Enter the Rate: ");
        float rate = input.nextFloat();

        System.out.print("Enter the time in years: ");
        float time = input.nextFloat();

        float result = (principal * rate * time ) / 100;
        System.out.println("Simple Interest: " + result);
    }
}
