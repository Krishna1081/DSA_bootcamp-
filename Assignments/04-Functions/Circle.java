package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //Write a program to print the circumference
        // and area of a circle of radius entered by user by defining your own method.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();
        System.out.println("The circumference: " + Circumference(radius));
        System.out.println("The area: " + Area(radius));
    }

    private static double Area(double radius) {
        return 22 * radius * radius / 7;
    }

    private static double Circumference(double radius) {
        return 2 * 22 * radius / 7;
    }
}
