package com.company;

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        //Area Of Parallelogram
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the parallelogram: ");
        double height = input.nextDouble();
        System.out.print("Enter the base of the parallelogram: ");
        double base = input.nextDouble();
        double Area = height * base;
        System.out.println("Area Of Parallelogram is: " + Area);
    }
}
