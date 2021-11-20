package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // 8. To find out whether the given String is Palindrome or not.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String pal = input.next().toLowerCase(Locale.ROOT);

        int i = 0;
        int j = pal.length() - 1;

        while (i<j){
            if (pal.charAt(i) == pal.charAt(j)){
                System.out.println("Palindrome");
                break;
            }if(pal.charAt(i) != pal.charAt(j)){
                System.out.println("Not Palindrome");
                break;
            }
            i ++;
            j --;
        }
    }
}
