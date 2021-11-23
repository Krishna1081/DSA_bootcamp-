package com.company;

import java.util.Scanner;

public class Discount_Of_Product {
    public static void main(String[] args) {
        //Calculate Discount Of Product

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        String product = input.next();

        System.out.print("Enter the listed price: ");
        double listed = input.nextDouble();

        System.out.print("Enter the selling price: ");
        double selling = input.nextDouble();

        double discount = listed - selling;
        if (selling < listed){
            System.out.print("Discount on " + product + " is: " + discount);
        }else{
            System.out.println("Selling price can't be less then listed price");
        }
    }
}
