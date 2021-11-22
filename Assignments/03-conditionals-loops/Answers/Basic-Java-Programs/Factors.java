package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = input.nextInt();

        int a = 1;
        System.out.print(a);

        int i = 2;
        if (number != 0) {
            while (i < number) {
                if (number % i == 0) {
                    System.out.print(", " + i);
                }
                i++;
            }
        }if (number <=0 ){
            System.out.println("This Program checks only for positive numbers");
        }
    }
}
