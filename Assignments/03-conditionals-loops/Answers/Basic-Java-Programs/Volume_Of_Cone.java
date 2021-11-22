package com.company;

import java.util.Scanner;

public class Volume_Of_Cone {
    public static void main(String[] args) {
        //Volume Of Cone
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        double Volume = 3.14 * Math.pow(radius,2) * height /3;
        System.out.println("Volume Of Cone is: " + Volume);
    }
}
