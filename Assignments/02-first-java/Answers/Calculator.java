package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Operator: ");
        char op = input.next().trim().charAt(0);

        System.out.print("Enter the first number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = input.nextInt();

        int result = 0;
        if (op == '+'){
            result = num_1 + num_2;
        }else if (op == '-'){
            result = num_1 - num_2;
        }else if (op == '*'){
            result = num_1 * num_2;
        }else if (op == '/'){
            result = num_1 / num_2;
        }else{
            System.out.println("Invalid Operator");
        }
        System.out.println("Result: " + result);
    }
}
