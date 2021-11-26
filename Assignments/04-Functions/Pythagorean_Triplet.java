package com.company;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        //(A Pythagorean triplet is when the sum of the square of two numbers
        // is equal to the square of the third number).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the height: ");
        int height = input.nextInt();
        System.out.print("Enter the hypotenuse: ");
        int hypotenuse = input.nextInt();
        System.out.println("It is a " + Triplet(base,height,hypotenuse));

    }

    private static String Triplet(int base, int height, int hypotenuse) {
        if (Math.pow(base,2) + Math.pow(height,2) == Math.pow(hypotenuse,2)){
            return "Pythagorean Triplet";
        }else{
            return "Not A Pythagorean Triplet";
        }
    }
}
