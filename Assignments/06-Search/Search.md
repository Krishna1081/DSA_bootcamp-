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
    
# Day 19
## Program 28
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4

Output: 2
## Code:
    class Solution {
        public int mySqrt(int x) {
            if(x==0){
                return 0;
            }
            int l = 1,h=x;
            while(h>=l){
                int mid = l+(h-l)/2;
                if(mid > x/mid){
                    h = mid-1;
                }else if(mid < x/mid){
                   l = mid + 1;
                }else{
                    return mid;
                }
            }
            return l-1;
        }
    }
## Program 29
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns 3 possible results:

-1: The number I picked is lower than your guess (i.e. pick < num).

1: The number I picked is higher than your guess (i.e. pick > num).

0: The number I picked is equal to your guess (i.e. pick == num).

Return the number that I picked.

Example 1:

Input: n = 10, pick = 6

Output: 6
## Code:
        public class Solution extends GuessGame {
            public int guessNumber(int n) {
                int start = 0; int end = n;
                while(start<=end){
                    int mid = start+(end-start)/2;
                    int pick= guess(mid);
                    if(pick==0){
                        return mid;
                    }
                    else if(pick== 1){
                        start = mid+1;
                    }else{
                        end=mid-1;
                    }
                }return -1;
            }
        }
# Day 20
## Program 30
Ceiling in a sorted array 
## Code:
    package com.company;

    public class Ceiling {
        public static void main(String[] args) {
            int[] arr = {2,3,5,14,16,19};
            int target = 15;
            int ans  = Find_Ceiling(arr,target);
            System.out.println("Ceiling: " + ans);
        }

        private static int Find_Ceiling(int[] arr, int target) {
            if (target > arr[arr.length-1]){
                return -1;
            }
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if (target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
            return start;
        }
    }
## Program 31
Floor in a sorted array 
## Code:
    package com.company;

    public class Floor {
        public static void main(String[] args) {
            int[] arr = {2,3,5,14,16,19};
            int target = 15;
            int ans  = Find_Floor(arr,target);
            System.out.println("Floor: " + ans);
        }

        private static int Find_Floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if (target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
            return end;
        }
    }
## Program 32
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 

Example 1:

Input: letters = ["c","f","j"], target = "a"

Output: "c"
## Code:
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if (target < letters[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
    }
## Program 33
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8

Output: [3,4]
## Code:
    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int[] ans = {-1, -1};

            int start = search(nums, target, true);
            int end = search(nums, target, false);

            ans[0] = start;
            if(ans[0] != -1){
                ans[1] = end;
            }
            return ans;
        }
        private static int search(int[] nums, int target, boolean findstartindex) {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    if (findstartindex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }
    
