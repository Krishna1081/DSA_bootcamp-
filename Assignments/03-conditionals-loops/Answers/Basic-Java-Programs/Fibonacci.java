package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci Series
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number");
        int number = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a);

        int sum;
        int i = 0;
        while (i < number){
            sum = a + b;
            System.out.print(", " + b);
            a = b;
            b = sum;
            i++;
        }
    }
}
