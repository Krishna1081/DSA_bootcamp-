package com.company;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        //2. Take name as input and print a greeting message for that name.

        System.out.print("Enter the Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
