package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Write a program to print the factorial of a number by defining a method named 'Factorial'.
        //Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number of factorial: ");
        int number = input.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    private static int factorial(int number) {
        int count = 1;
        int factorial = 1;
        if ( number == 0 | number == 1){
            return factorial;
        }
        while (count <= number ){
            factorial = factorial * count;
            count  = count + 1;
        }
        return factorial;
    }
}
