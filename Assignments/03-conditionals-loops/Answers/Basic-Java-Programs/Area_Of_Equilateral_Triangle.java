package com.company;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        //Area Of Equilateral Triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = input.nextDouble();
        double Area = Math.sqrt(3)/4 * Math.pow(side,2);
        System.out.print("Area Of Equilateral Triangle is: " + Area);
    }
}
