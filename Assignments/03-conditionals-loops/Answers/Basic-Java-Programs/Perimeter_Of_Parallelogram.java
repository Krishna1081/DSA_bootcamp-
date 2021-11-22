package com.company;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        //Perimeter Of Parallelogram
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the parallelogram: ");
        double side = input.nextDouble();
        System.out.print("Enter the base of the parallelogram: ");
        double base = input.nextDouble();
        double Perimeter =  2 * (side + base);
        System.out.println("Area Of Parallelogram is: " + Perimeter);
    }
}
