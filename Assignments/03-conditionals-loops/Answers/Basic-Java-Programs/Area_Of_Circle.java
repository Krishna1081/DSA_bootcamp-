package com.company;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        //Area Of Circle Java Program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        double Area = 3.14 * Math.pow(radius,2);
        System.out.println("Area Of A Circle is: " + Area);
    }
}
