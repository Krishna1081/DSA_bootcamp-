package com.company;

import java.util.Scanner;

public class Sum_Till_Zero {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            if (number != 0){
                sum = sum + number;
            }else{
                System.out.println("Done");
                break;
            }
        }
        System.out.println("The Sum of all the numbers till now: " + sum);
    }
}
