package com.company;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        //Calculate CGPA Java Program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the subject marks: ");
            int marks = input.nextInt();
            sum = sum + (marks/10);
        }
        System.out.print("CGPA: " + sum/n);
    }
}
