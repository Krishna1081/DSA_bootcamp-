package com.company;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        //HCF Of Two Numbers Program

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = input.nextInt();
        int N,D,r;

        if (num_1>num_2){
            N=num_1;
            D=num_2;
        }else{
            N=num_2;
            D=num_1;
        }
        r=N/D;
        while (r!= 0){
            N=D;
            D=r;
            r=N%D;
        }
        System.out.println("HCF: " + D);
    }
}
