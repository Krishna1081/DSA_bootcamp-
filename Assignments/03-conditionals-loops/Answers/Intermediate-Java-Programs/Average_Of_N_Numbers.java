package com.company;

import java.util.Scanner;

public class Average_Of_N_Numbers {
    public static void main(String[] args) {
        //Calculate Average Of N Numbers
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the times the loop should run: ");
        int n = input.nextInt();
        double sum = 0;
        double average;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            double number = input.nextDouble();
            sum = sum + number;
        }
        average = sum / n;
        System.out.print("The Average Of " + n + " is: " + average);
    }
}
