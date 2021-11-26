package com.company;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println(Vote(age));
    }

    private static String Vote(int age) {
        if (age < 18){
            return "You can't Vote";
        }else{
            return "You can Vote";
        }
    }
}
