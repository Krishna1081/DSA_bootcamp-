# Day 17

## Program 23
Linear Search in Strings 

## Code:

  package com.company;

  public class Search_In_Strings {
      public static void main(String[] args) {
          String name = "Kunal";
          char target = 'u';
          System.out.println(search(name, target));
          System.out.println(search2(name, target));
      }
      static  boolean search2(String str,char target){
          if (str.length() == 0){
              return false;
          }
          for(char ch: str.toCharArray()){
              if(ch == target){
                  return true;
              }
          }
          return false;
      }

      static  boolean search(String str,char target){
          if (str.length() == 0){
              return false;
          }
          for (int i = 0; i < str.length(); i++) {
              if (target == str.charAt(i)){
                  return true;
              }
          }
          return false;
      }
  }
  
## Program 24
Linear Search in range

## Code:
    package com.company;

    import java.util.Scanner;

    public class Search_In_Range {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = {1,2,3,4,5,6,7,8,9};
            System.out.print("Enter the start index: ");
            int start = input.nextInt();
            System.out.print("Enter the end index: ");
            int end = input.nextInt();
            System.out.print("Enter the target number: ");
            int target = input.nextInt();
            System.out.println("Index: " + search(arr,start,end,target));
        }
        static  int search(int[] arr, int start, int end, int target){
            if (arr.length == 0){
                return -1;
            }
            for(int i = start; i <= end;i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
## Program 25
Linear Search in 2D Matrix

## Code:
  package com.company;

  public class Minimum_2D_Matrix {
      public static void main(String[] args) {
          int[][] arr = {
                  {1,2,3,4},
                  {5,6,7},
                  {8,9,10,11}
          };
          int ans = FindIndex(arr);
          System.out.println(ans);
      }

      private static int FindIndex(int[][] arr) {
          int max = Integer.MIN_VALUE;
          for (int[] ints : arr) {
              for (int element : ints) {
                  if (element > max) {
                      max = element;
                  }
              }
          }
          return max;
      }
  }

## Program 26
Linear Search to find minimum number

## Code:
  package com.company;

  public class SearchMinimumNumber {
      public static void main(String[] args) {
          int[] arr = {1,2,3,4,34,23,45,-1,-2};
          int ans = Find_Minimum(arr);
          System.out.println("Minimum number in the array: " + ans);
      }

      private static int Find_Minimum(int[] arr) {
          int min = arr[0];
          for (int j : arr) {
              if (j < min) {
                  min = j;
              }
          }
          return min;
      }
  }

## Program 27
Linear Search to find the minimum number in 2D Matrix

## Code:
  package com.company;

  public class Minimum_2D_Matrix {
      public static void main(String[] args) {
          int[][] arr = {
                  {1,2,3,4},
                  {5,6,7},
                  {8,9,10,11}
          };
          int ans = FindIndex(arr);
          System.out.println(ans);
      }

      private static int FindIndex(int[][] arr) {
          int max = Integer.MIN_VALUE;
          for (int[] ints : arr) {
              for (int element : ints) {
                  if (element > max) {
                      max = element;
                  }
              }
          }
          return max;
      }
  }

# Day 18
## Program 26
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

## Code:
  class Solution {
      public int maximumWealth(int[][] accounts) {
          // person = rol 
         // account = col
          int ans  = Integer.MIN_VALUE;
          for(int[] ints: accounts){
          // when you start a new col, take a new sum for that row
              int sum = 0;
              for(int anint: ints){
                  sum+=anint;
              }
              if(sum>ans){
                  ans= sum;
              }
          }
          return ans;
      }
  }
## Program 27
Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits

## Code:
  class Solution {
      public int findNumbers(int[] nums) {
          int countEven=0;
          for(int i=0;i<nums.length;i++){
              int n=nums[i];
              int countDigits=0;
              while(n!=0){
                  int rem=n%10;
                  countDigits++;
                  n=n/10;
              }
              if(countDigits%2==0){
                  countEven++;
              }
          }
          if(countEven==0){
              return 0;
          }
          return countEven;
      }
  }
