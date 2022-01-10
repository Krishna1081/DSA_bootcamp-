## Day 11 
# Program 1: 
One array of integers is given as an input ,which is initially increasing and then decreasing or 
it can be only increasing or decreasing , you need to find the maximum value in the array in O(Log n) Time complexity and O(1) Space Complexity 
Asked in: Amazon, Microsoft, Uber

package com.company;

import java.util.Arrays;
//import java.util.Scanner;

public class Increasing_Decreasing_Max_Value {
    public static void main(String[] args) {
        /*
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array: ");
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter the " + (i+1) + " of " + n + " number: ");
//            int m = input.nextInt();
//            arr[i] = m;
//        }
        */
        int[] arr = {6,9,15,25,35,50,41,29,23,8};
        System.out.println("Array is: " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        System.out.println("Array's max value: " + Max_Value(arr,start,end));
    }

    private static int Max_Value(int[] arr, int start, int end) {
        if (start == end){
            return arr[start];
        }
        if (end == start + 1)
        {
            if(arr[start] >= arr[end])
                return arr[start];
            else
                return arr[end];
        }

        int mid = (start+end)/2;
        if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            return arr[mid];
        }if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1] ){
            return Max_Value(arr,start,mid-1);
        }else{
            return Max_Value(arr,mid+1,end);
        }
    }
}

# Program 2: 
We rotate an ascending order sorted array at some point unknown to user.
So for instance, 3 4 5 6 7 might become 5 6 7 3 4. Modify binary search algorithm to
find an element in the rotated array in O(log n) time and O(1) Space complexity

package com.company;

import java.util.Scanner;

public class Rotated_Array {
    public static void main(String[] args) {
        /*
//        We rotate an ascending order sorted array at some point unknown to user.
//        So for instance, 3 4 5 6 7 might become 5 6 7 3 4. Modify binary search algorithm to
//        find an element in the rotated array in O(log n) time and O(1) Space complexity
        */
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 5, 6, 7, 1, 2};
        int start = 0;
        int end = arr.length - 1;
        int key = input.nextInt();
        System.out.println("Found the element at index: " + Rotate_Search(arr, start, end, key));
    }

    private static int Rotate_Search(int[] arr,int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + end / 2;
        if (arr[mid] == key)
            return key;
        if (arr[start] <= arr[mid]) {
            if (key >= arr[start] && key <= arr[mid])
                return Rotate_Search(arr,key, start, mid - 1);
            return Rotate_Search(arr,key, mid + 1, end);
        }
        if(key >= arr[start] && key <= arr[end])
            return Rotate_Search(arr, key, mid + 1, end);
        return Rotate_Search(arr, key, start, mid - 1);
    }
}

# Program 3:
Array consist of only 0's, 1's and 2's.
Write an algorithm to sort  this array in O(n) time complexity and
O(1) Space complexity with only one traversal Asked in : Amazon, Microsoft, Adobe, WalmartLabs

package com.company;


import java.util.Arrays;

public class Arrange_0_1_2 {
    public static void main(String[] args) {
        /*
//      Array consist of only 0's, 1's and 2's.
//      Write an algorithm to sort  this array in O(n) time complexity and
//      O(1) Space complexity with only one traversal Asked in : Amazon, Microsoft, Adobe, WalmartLabs
        */
        int[] arr = {0,1,0,2,2,0,1,0,1};
        int n = arr.length;
        System.out.println("Array before Sort: " + Arrays.toString(arr));
        Arrange(arr,n);
        System.out.println("Array after Sort: " + Arrays.toString(arr));
    }

    private static void Arrange(int[] arr,int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid<=high){
            if (arr[mid] == 2){
                swap(arr,mid,high);
            --high;
            }
            else if (arr[mid] == 0){
                swap(arr,mid,low);
            ++low;
            ++mid;
            }
            else{
                ++mid;
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}

# Program 4:
Given an array arr, write a function to move all 0's to the end of it while maintaining the relative order of
the non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed

package com.company;

import java.util.Arrays;

public class Zero_To_End {
    public static void main(String[] args) {
//        Given an array arr,
//        write a function to move all 0's to the end of it while maintaining the relative order of
//        the non-zero elements in O(n)
//        Time complexity and O(1) Space complexity with single traversal allowed
        int[] arr = {1,0,2,0,3,0,4};
        int n = arr.length;
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        Put_Zero_To_The_End(arr,n);
        System.out.println("Array After Soring: " + Arrays.toString(arr));
    }

    private static void Put_Zero_To_The_End(int[] arr, int n) {
        int cnt = 0;
        for (int i = 0; i < (n); i++) {
            if (arr[i] != 0){
                arr[cnt++] = arr[i];
            }
        }
        while(cnt<n){
            arr[cnt++] = 0;
        }
    }
}
