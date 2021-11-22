package com.company;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        double CSA = 2 * 3.14 * radius * height;
        System.out.println("Curved Surface Area of cylinder is: " + CSA);
    }
}
