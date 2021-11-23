package com.company;

import java.util.Scanner;

public class Depreciation_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        long amount = input.nextLong();
        System.out.print("Enter teh depreciation percentage: ");
        long depreciation_percentage =input.nextLong();
        System.out.print("Enter the number of years: ");
        long year = input.nextLong();
        long temp = amount;
        for(int i=0;i<year;i++) {
            temp = ((100-depreciation_percentage)*temp)/100;
        }
        System.out.println("after depreciation = "+temp);
    }
}
