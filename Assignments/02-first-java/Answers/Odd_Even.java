package com.company;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        //1. Write a program to print whether a number is even or odd, also take input.

        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
