package com.company;

import java.util.Scanner;

public class Perimeter_Of_Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = input.nextDouble();
        double Perimeter = 4 * side;
        System.out.println("Perimeter Of Square: " + Perimeter);
    }
}
