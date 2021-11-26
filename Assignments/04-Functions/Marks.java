package com.company;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        Grade(marks);
    }

    private static void Grade(int marks) {
        if ((double)marks/10 > 4.1 & marks/10 < 5){
            System.out.println("DD");
        }if (marks/10 < 4){
            System.out.println("Fail");
        }

        switch (marks / 10) {
            case 10, 9 -> System.out.println("AA");
            case 8 -> System.out.println("AB");
            case 7 -> System.out.println("BB");
            case 6 -> System.out.println("BC");
            case 5 -> System.out.println("CD");
        }
    }
}


