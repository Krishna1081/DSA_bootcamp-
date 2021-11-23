package com.company;

import java.util.Scanner;

public class Future_Investment_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Present value: ");
        double present_value = input.nextDouble();
        System.out.print("Enter the number of periods the investment will be held in years: ");
        int t = input.nextInt();
        System.out.print("Enter the interest paid in investments: ");
        double n = input.nextDouble();
        System.out.println("Future Value: " + (float)(present_value * Math.pow((1 + (n/100)),t)));
    }
}
