package com.company;

import java.util.Scanner;

public class Prime_Range {
    public static void main(String[] args) {
        //Write a function that returns all prime numbers between two given numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start of the range");
        int a = input.nextInt();
        System.out.println("Enter the end of the range");
        int b = input.nextInt();
        RangePrime(a,b);
    }

    private static void RangePrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int flag;
            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if I is prime or not
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}

