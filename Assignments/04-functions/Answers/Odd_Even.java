package com.company;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println(Odd_Even_Number(n));
    }

    private static String Odd_Even_Number(int n) {
        if (n <= 1){
            return "Neither Even nor Odd";
        }else{
            if(n % 2 == 0){
                return "Even";
            }else{
                return "Odd";
            }
        }
    }
}
