package com.company;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        //6. Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Indian rupees: ");
        int rupees = input.nextInt();
        double conversion = rupees * 0.013;
        System.out.println("Indian Rupees to USD: " + conversion + " $");
    }
}
