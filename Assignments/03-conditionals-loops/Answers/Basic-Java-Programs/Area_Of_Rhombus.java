package com.company;

import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        //Area Of Rhombus
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of diagonal 1: ");
        double d1 = input.nextDouble();

        System.out.print("Enter the length of diagonal 2: ");
        double d2 = input.nextDouble();

        if (d1 <= 0 || d2 <= 0){
            System.out.println("Length of the diagonal must be positive");
        }else{
            double Area = d1 * d2 / 2;
            System.out.println("Area Of Rhombus: " + Area);
        }

    }
}
