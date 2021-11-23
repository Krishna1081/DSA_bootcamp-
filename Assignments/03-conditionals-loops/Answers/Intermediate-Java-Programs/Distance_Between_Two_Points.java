package com.company;

import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {

        //Calculate Distance Between Two Points

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the (x,y) of the first point");
        System.out.print("Enter the x coordinate: ");
        int x_1 = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y_1 = input.nextInt();

        System.out.println("Enter the (x,y) of the second point");
        System.out.print("Enter the x coordinate: ");
        int x_2 = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y_2 = input.nextInt();

        double calc = Math.sqrt(Math.pow(x_2 - x_1,2) + Math.pow(y_2 - y_1,2) );
        System.out.println("Distance Between the 2 points: " + (float)(calc));
    }
}
