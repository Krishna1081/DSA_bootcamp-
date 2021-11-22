package com.company;

import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        //Volume Of Pyramid
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base Area: ");
        double Base_Area = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        double Volume = Base_Area * height / 3;
        System.out.println("Volume Of Cone is: " + Volume);
    }
}
