package com.company;

import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        //Perimeter Of Circle
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of the circle: ");
        double radius = input.nextDouble();
        double Perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter Of The Circle: " + Perimeter);
    }
}
