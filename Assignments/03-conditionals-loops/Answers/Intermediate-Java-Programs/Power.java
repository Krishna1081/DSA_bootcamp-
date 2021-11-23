package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //Power In Java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        System.out.print("Enter the number in which the power is raised: ");
        int number = input.nextInt();
        System.out.println("Power: " + Math.pow(number,power));
    }
}
