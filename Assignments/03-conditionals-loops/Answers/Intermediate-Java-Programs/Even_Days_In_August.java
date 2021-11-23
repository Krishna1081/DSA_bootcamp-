package com.company;

public class Even_Days_In_August {
    public static void main(String[] args) {
        //Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
        int a = 2;
        System.out.print("Number of days Kunal can go out: " + a);
        int i = 3;
        while ( i <= 31){
            if (i % 2 == 0){
                System.out.print(", " + i);
            }
            i++;
        }
    }
}
