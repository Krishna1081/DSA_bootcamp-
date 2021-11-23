package com.company;

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        //Calculate Commission Percentage
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission amount: ");
        double commission_amt = input.nextDouble();
        System.out.print("Enter the sale price: ");
        double sale_price = input.nextDouble();
        double commission_percentage = commission_amt * 100/ sale_price;
        System.out.println("Commission Percentage: " + commission_percentage + "%");
    }
}
