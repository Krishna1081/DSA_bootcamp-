package com.company;

import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        //Area Of Rectangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = input.nextInt();
        int Area = length * breadth;
        System.out.println("Area Of Triangle is: " + Area);
    }
}
