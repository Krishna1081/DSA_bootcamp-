package com.company;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        //Check Leap Year Or Not
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        if ((year%4 == 0 || year%400 == 0) & (year%100 != 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not A Leap Year");
        }
    }
}
