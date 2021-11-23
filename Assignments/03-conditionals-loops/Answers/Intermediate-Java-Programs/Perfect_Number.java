package com.company;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        //Perfect Number In Java

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int factor = 0;
        int i = 0;
        while (i < number){
            if ( i != 0){
                if (number % i == 0){
                    factor = factor + i;
                }
            }
            i = i + 1;
        }
        if (factor == number){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not A Perfect Number");
        }
    }
}
