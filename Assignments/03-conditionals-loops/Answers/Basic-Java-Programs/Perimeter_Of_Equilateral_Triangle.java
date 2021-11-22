package com.company;

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        //Perimeter Of Equilateral Triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = input.nextDouble();
        double Perimeter = 3 * side;
        System.out.print("Area Of Equilateral Triangle is: " + Perimeter);
    }
}
