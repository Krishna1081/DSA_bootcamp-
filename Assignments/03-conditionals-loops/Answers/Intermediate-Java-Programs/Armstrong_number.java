package com.company;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        //Armstrong Number In Java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int x = number;
        int count = 0;
        while (x!=0){
            count +=1;
            x /= 10;
        }
        int y = number;
        int sum = 0;
        int i = 0;
        while (i < count){
            int remainder = y % 10;
            sum += Math.pow(remainder,count);
            y /= 10;
            i +=1;
        }
        if (number == sum) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }
}
