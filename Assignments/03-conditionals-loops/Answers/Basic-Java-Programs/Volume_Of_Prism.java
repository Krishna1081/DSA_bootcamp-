package com.company;

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        //Volume Of Prism
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base Area: ");
        double B = input.nextDouble();
        System.out.println("Enter the height: ");
        double h = input.nextDouble();
        double Volume = B*h;
        System.out.println("Volume Of Cone is: " + Volume);
    }
}
