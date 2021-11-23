package com.company;

import java.util.Scanner;

public class Positive_Odd_Even_Negative_Numbers {
    public static void main(String[] args) {
        //Write a program to print the sum of negative numbers,
        // sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N)
        // entered by the user.The list terminates when the user enters a zero.

        int sum_negative = 0;
        int sum_odd = 0;
        int sum_even = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to exit");
        while(true){
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            if (number > 0){
                if (number % 2 == 0){
                    sum_even += number;
                }else{
                    sum_odd += number;
                }
            }else if(number < 0){
                sum_negative += number;
            }else{
                break;
            }
        }
        System.out.println("Sum Of Even numbers " + sum_even);
        System.out.println("Sum Of Odd numbers " + sum_odd);
        System.out.println("Sum Of Negative numbers " + sum_negative);
    }
}
