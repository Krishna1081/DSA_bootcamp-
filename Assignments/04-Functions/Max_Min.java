package com.company;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        //	Define two methods to print the maximum and the minimum number
        //	respectively among three numbers entered by the user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = input.nextInt();
        System.out.println("Enter the second number");
        int m = input.nextInt();
        System.out.println(max(n,m));
        System.out.println(min(n,m));
    }
    static String max(int n, int m){
        if (n>m){
            return ("Max: " + n);
        }else{
            return ("Max: " + m);
        }
    }
    static String min(int n, int m){
        if (m>n){
            return ("Min: " + n);
        }else{
            return ("Min: " + m);
        }
    }
}
