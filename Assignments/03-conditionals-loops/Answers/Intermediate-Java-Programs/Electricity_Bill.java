package com.company;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        //Calculate Electricity Bill

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of appliances: ");
        int appliance = input.nextInt();
        System.out.print("Enter the rating for the appliance : ");
        int power = input.nextInt();
        System.out.print("Enter the number of hours it runs for a day: ");
        int time = input.nextInt();
        System.out.print("Enter the number of days it runs in a month: ");
        int month = input.nextInt();
        System.out.print("Enter the rate charged per 1 Kilo Watt hour in rupees: ");
        double charge = input.nextDouble();

        double calc = appliance * month * power * time * charge / 1000;
        System.out.print("The Electricity bill for " + month + " days is: " + calc + "₹");
    }
}
