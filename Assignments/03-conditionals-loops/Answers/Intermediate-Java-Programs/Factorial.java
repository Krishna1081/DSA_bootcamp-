package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Factorial Program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int number = input.nextInt();

        int i = 1;
        int product = 1;
        while (i <= number){
            product *= i;
            i = i + 1;
        }
        System.out.println("The Factorial is: " + product);
    }
}
