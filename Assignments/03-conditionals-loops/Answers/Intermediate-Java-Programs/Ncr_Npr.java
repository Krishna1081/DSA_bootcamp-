package com.company;

import java.util.Scanner;

public class Ncr_Npr {
    public static void main(String[] args) {
        //Find Ncr & Npr
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of objects (n): ");
        int n = input.nextInt();
        System.out.println("Enter the number of objects taken at a time (r): ");
        int r = input.nextInt();
        int difference = n - r;

        while (true) {
            if (n > r || n == r) {
                int i = n;
                int count = 1;
                int fact_n = 1;
                while (count <= i) {
                    fact_n *= i;
                    i = i - 1;
                }
                int j = r;
                int count_1 = 1;
                int fact_r = 1;
                while (count_1 <= j) {
                    fact_r *= j;
                    j = j - 1;
                }
                int k = difference;
                int count_2 = 1;
                int fact_difference = 1;
                while (count_2 <= k) {
                    fact_difference *= k;
                    k = k - 1;
                }
                System.out.println("Ncr: " + fact_n / fact_r * fact_difference);
                break;
            }
            if (difference < 0) {
                System.out.println("n must be greater than r");
                break;
            }
        }
        while (true) {
            if (n > r || n == r) {
                int i = n;
                int count = 1;
                int fact_n = 1;
                while (count <= i) {
                    fact_n *= i;
                    i = i - 1;
                }
                int k = difference;
                int count_2 = 1;
                int fact_difference = 1;
                while (count_2 <= k) {
                    fact_difference *= k;
                    k = k - 1;
                }
                System.out.println("npr: " + fact_n / fact_difference);
                break;
            }if (difference < 0){
                System.out.println("n must be greater than r");
                break;
            }
        }
    }
}
