package com.company;

import java.util.Scanner;

public class Largest_Number_Till_Zero {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);
        int largest_number = 0;

        while (true){
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            if (largest_number < number){
                largest_number = number;
            }if (number == 0){
                System.out.println("Done");
                break;
            }
        }
        System.out.println("Largest number: " + largest_number);
    }
}

