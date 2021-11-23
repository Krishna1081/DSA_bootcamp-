package com.company;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        //Calculate Average Marks
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub = input.nextInt();
        int sum = 0;
        for (int i = 0; i < sub; i++) {
            System.out.print("Enter the marks ");
            int marks = input.nextInt();
            sum += marks;
        }
        System.out.println("Average marks: " + sum/sub );
    }
}
