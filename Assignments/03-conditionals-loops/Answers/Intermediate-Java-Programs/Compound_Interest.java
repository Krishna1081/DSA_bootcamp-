package com.company;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        double P = input.nextDouble();
        System.out.print("Enter the amount of time in years: ");
        int t = input.nextInt();
        System.out.print("Enter the number of times the interest was compounded annually: ");
        int n = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double r = input.nextDouble();

        double calc = P * Math.pow((1+ (r/n)),n*t);
        System.out.println("Compound Interest: " + (float)(calc));
    }
}
