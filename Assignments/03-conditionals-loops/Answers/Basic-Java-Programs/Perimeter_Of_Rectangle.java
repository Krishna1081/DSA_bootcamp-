package com.company;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        //Perimeter Of Rectangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = input.nextInt();
        int Perimeter = 2 * (length * breadth);
        System.out.println("Area Of Triangle is: " + Perimeter);
    }
}
