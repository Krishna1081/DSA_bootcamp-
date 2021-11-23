package com.company;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        //Calculate Batting Average

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total runs: ");
        int total_runs = input.nextInt();

        System.out.println("Enter the number of matches: ");
        int matches = input.nextInt();
        int avg;
        int temp;
        int temp_1;
        while (true){
            System.out.println("Enter the number of innings: ");
            int innings = input.nextInt();
            temp =innings;
            if(innings <= matches){
                break;
            }
            System.out.println("Enter the innings correctly (must be less then matches)");
        }

        while (true){
            System.out.println("Enter the number of not outs: ");
            int not_outs = input.nextInt();
            temp_1 = not_outs;
            if(not_outs <= temp){
                break;
            }
            System.out.println("Enter the innings correctly (must be less then matches)");
        }
        if (temp == temp_1){
            avg = total_runs;
        }else{
            avg = total_runs/temp-temp_1;
        }
        System.out.println("Batting Average: " + avg);
    }
}
