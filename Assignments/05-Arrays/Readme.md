# Day 11 
## Program 1: 
One array of integers is given as an input ,which is initially increasing and then decreasing or 
it can be only increasing or decreasing , you need to find the maximum value in the array in O(Log n) Time complexity and O(1) Space Complexity 
Asked in: Amazon, Microsoft, Uber

## Code:
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

## Program 2: 
We rotate an ascending order sorted array at some point unknown to user.
So for instance, 3 4 5 6 7 might become 5 6 7 3 4. Modify binary search algorithm to
find an element in the rotated array in O(log n) time and O(1) Space complexity

## Code:
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

## Program 3:
Array consist of only 0's, 1's and 2's.
Write an algorithm to sort  this array in O(n) time complexity and
O(1) Space complexity with only one traversal Asked in : Amazon, Microsoft, Adobe, WalmartLabs

## Code:
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

## Program 4:
Given an array arr, write a function to move all 0's to the end of it while maintaining the relative order of
the non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed

## Code:
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
# Day 12 

## Program 5:
You have an array of non-negative integers,you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position. Determine if you are able to reach the last index in O(n) Time complexity
and O(1) Space Complexity 
Asked in: Adobe, Intuit

## Code:
package com.company;
public class Jump_Game {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,9,2,3,4,5,6};
        int n = arr.length;
        int ans = Jump(arr,n);
        System.out.println("Number of jumps: " + ans);
    }

    private static int Jump(int[] arr, int n) {
        int a = arr[0];
        int b = arr[0];
        int jump = 1;
        for (int i = 1; i < n; i++) {
            if (i == (n-1))
                return jump;
            a--;
            b--;
            if(arr[i]>b){
                b = arr[i];
            }
            if (a == 0){
                jump++;
                a = b;
            }
        }
        return jump;
    }
}

## Program 6:
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
Do not allocate extra space for another array, Time complexity O(n) and Space complexity O(1)

## Code:
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Values {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " of " + n + " elements: ");
            int ele = input.nextInt();
            arr[i] = ele;
        }
        int m = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Length after removing duplicates: "+ Duplicate_Remove(arr,m));
    }

    private static int Duplicate_Remove(int[] arr,int m) {
        if (m == 0 || m == 1)
            return m;

        int j = 0;
        for (int i = 0; i < m-1; i++){
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[m-1];
        return j;
    }
}
## Program 7:
Write an algorithm to find out next greater number to given number with the same set of digits 
Asked in : Morgan Stanley Make my trip Amazon

## Code:
package com.company;

import java.util.Arrays;

public class Next_Great_Number {
    public static void main(String[] args) {

        int[] array= {2,1,8,7,6,5};
        int n = array.length;
        Great_Number(array,n);
    }

    private static void Great_Number(int[] array, int n) {
    int i;
    for (i = n - 1; i > 0; i--)
        {
            if (array[i] > array[i - 1]) {
                    break;
                }
        }
    if (i == 0)
        {
            System.out.println("Not possible");
        }
    else
    {
            int x = array[i - 1], min = i;

            for (int j = i + 1; j < n; j++)
                {
                    if (array[j] > x && array[j] < array[min])
                        {
                            min = j;
                        }
                }

            swap(array, i - 1, min);

            Arrays.sort(array, i, n);
            System.out.print("Next number with same set of digits is: ");
            for (i = 0; i < n; i++)
                    System.out.print(array[i]);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
## Program 8:
We have an array, we have to find an element before which all elements are less than it, 
and after which all are greater than it. Finally, return the index of the element,
if there is no such element, then return -1: Time complexity O(n) and Space Complexity O(n)

## Code:
package com.company;

public class Left_Side_Right_Side {
    public static void main(String[] args) {
//        We have an array, we have to find an element before which all elements are less than it,
//        and after which all are greater than it. Finally, return the index of the element,
//        if there is no such element, then return -1: Time complexity O(n) and Space Complexity O(n)
        int[] arr = {6,2,5,4,7,9,11,8,10};
        int n = arr.length;
        int ans = Min_Right_Max_Left(arr,n);
        System.out.println("Element which has min value on right and max value on the left: " + ans);
    }

    private static int Min_Right_Max_Left(int[] arr, int n) {
        int[] left = new int[n];
        left[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],arr[i-1]);
        }
        int right = Integer.MAX_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if (left[i] < arr[i] && right > arr[i])
                return i;
            right = Math.min(right,arr[i]);
        }
        return -1;
    }
}
## Program 9:
Rectangle that is represented as a list [x1, y1, x2, y2],
where (x1, y1) is the coordinates of its top-left corner,
and (x2, y2) is the coordinates of its bottom-right corner.
Now two rectangles overlap if the area of their intersection is positive.
Two rectangles that only touch at the corner or edges do not overlap.Check in O(1)
Time complexity and O(1) Space complexity that both rectangle overlap or not
Asked in: GoldmanSachs, Expedia, OLA

## Code:
package com.company;

import java.awt.*;

public class Rectangles_Overlap {
    public static void main(String[] args) {
        Point S = new Point();
        Point P = new Point();
        Point S1 = new Point();
        Point P1 = new Point();
        S.x=0;S.y=10;P.x=10;P.y=0;
        S1.x=5;S1.y=5;P1.x=15;P1.y=0;
        if (check_overlap_rectangle(S,P,S1,P1)){
            System.out.println("Rectangle Overlaps");
        }else{
            System.out.println("Rectangle Does Not Overlap");
        }
    }
    static boolean check_overlap_rectangle(Point S,Point P,Point S1,Point P1){
        if (S.x >= P1.x || S1.x>=P.x){
            return false;
        }
        if (S.y <= P.y || S1.y <= P.y){
            return false;
        }
        return true;
    }
}
