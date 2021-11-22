package com.company;

import java.util.Scanner;

public class Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        //Perimeter Of Rhombus
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of Rhombus: ");
        double side = input.nextDouble();


        if (side <= 0) {
            System.out.println("side of the rhombus must be positive");
        } else {
            double Perimeter = 4 * side;
            System.out.println("Area Of Rhombus: " + Perimeter);
        }
    }
}
