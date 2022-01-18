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

