package com.company;

import java.util.Scanner;

public class Sum_Product {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int sum = 0;
        int product = 1;

        while (number != 0){
            int remainder = number % 10;
            sum += remainder;
            product *= remainder;
            number /= 10;
        }
        System.out.print("Difference between the sum and product of the digits is: " + (product - sum));
    }
}
