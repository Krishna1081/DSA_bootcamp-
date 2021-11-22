package com.company;

import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        //Volume Of Sphere
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double Volume = 4 * 3.14 * Math.pow(radius,3)/ 3;
        System.out.println("Volume Of Cone is: " + Volume);
    }
}
