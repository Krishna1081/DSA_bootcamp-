package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("The number is : " + IsPrime(number));
    }

    private static String IsPrime(int number) {
        if(number <= 1){
            return "Not Prime";
        }
        int c = 2;
        while (c*c <= number){
            if (number%c==0){
                return "Not Prime";
            }
            c ++;
        }
        return "Prime";
    }
}
