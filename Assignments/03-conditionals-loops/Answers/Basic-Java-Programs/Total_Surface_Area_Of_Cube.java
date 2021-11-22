package com.company;

import java.util.Scanner;

public class Total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        //Total Surface Area Of Cube
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        double side = input.nextDouble();
        double TSA = 6 * Math.pow(side,2);
        System.out.println("Total Surface Area Of Cube is: " + TSA);
    }
}
