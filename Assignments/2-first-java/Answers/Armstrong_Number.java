package com.company;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        // 9. To find Armstrong Number between two given number.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting index: ");
        int start = input.nextInt();
        System.out.println("Enter the ending index: ");
        int end = input.nextInt();

        for (int i = start + 1; i < end; ++i) {

            // number of digits calculation
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }

            // compute sum of nth power of
            // its digits
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }

            // checks if number i is equal
            // to the sum of nth power of
            // its digits
            if (pow_sum == i)
                System.out.print(i + " ");
        }
    }
}
