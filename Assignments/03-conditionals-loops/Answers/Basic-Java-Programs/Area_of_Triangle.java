package com.company;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        // Area Of Triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();
        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();

        double Area = 0.5 * height * base;
        System.out.println("Area Of Triangle is: " + Area);
    }
}
