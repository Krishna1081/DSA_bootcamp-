package com.company;

import java.util.Scanner;

public class Area_Of_Isosceles_Triangle {
    //Area Of Isosceles Triangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side which is unique in the triangle: ");
        double b = input.nextInt();

        System.out.print("Enter the side of similar lengths in the triangle: ");
        double a = input.nextInt();

        double Area = (b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("Area Of The Isosceles Triangle: " + Area);
    }
}
