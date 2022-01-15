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

# Day 13
## Program 10:
List of arrival and departure time is given, Find the minimum number of platforms are required for the railway as no train waits
## Code:
    package com.company;

    import java.util.Arrays;

    public class Arrival_Departure {
        public static void main(String[] args) {
            int[] arrival = {100,140,150,200,215,400};
            int[] departure = {110,300,220,230,315,600};
            Arrays.sort(departure);
            Arrays.sort(arrival);
            int n = arrival.length;
            System.out.println("Minimum platforms needed: " + find_minimum_platform(arrival,departure,n));
        }

        private static int find_minimum_platform(int[] arrival, int[] departure, int n) {
            int plat_needed = 1;
            int max_platform = 1;int i = 1;int j = 0;
            while(i<n){
                if (arrival[i] <= departure[j]){
                    plat_needed++;
                    i++;
                    if (plat_needed>max_platform){
                        max_platform = plat_needed;
                    }
                }else{
                    plat_needed--;
                    j++;
                }
            }
            return max_platform;
        }
    }
    
## Program 11:
There are N children standing in a line with some rating value. You want to distribute a minimum number of candies to these children such that:
Each child must have at least one candy.
The children with higher ratings will have more candies than their neighbors.
You need to write a program to calculate the minimum candies you must give.
## Code:
    package com.company;


    public class Children_Need_Candy {
        public static void main(String[] args) {
            /*
            There are N children standing in a line with some rating value.
            You want to distribute a minimum number of candies to these children such that:
            Each child must have at least one candy.
            The children with higher ratings will have more candies than their neighbors.
            You need to write a program to calculate the minimum candies you must give.
             */
            int[] ranking = {1,5,2,1};
            int n = ranking.length;
            int ans = Sum_Candy(ranking,n);
            System.out.println("Minimum number of candies: " + ans);
        }

        private static int Sum_Candy(int[] ranking, int n) {
            int[] left = new int[ranking.length];
            int[] right = new int[ranking.length];
            int result = 0;
            left[0] = 1;
            right[ranking.length-1] = 1;
            for (int i = 1; i < n; i++) {
                if (ranking[i] > ranking[i-1]){
                    left[i] = left[i-1] + 1;
                }else{
                    left[i]=1;
                }
            }
            for (int i = ranking.length-2; i >= 0; i--) {
                if (ranking[i] >= ranking[i+1]){
                    right[i] = right[i+1] + 1;
                }else{
                    right[i] = 1;
                }
            }
            for (int i = 0; i < ranking.length; i++) {
                result += Math.max(right[i],left[i]);
            }
            return result;
        }
    }

## Program 12:

## Code:
    package com.company;


    public class Spiral_Matrix {
        public static void main(String[] args) {
            int[][] arr = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
            int R = 4;
            int C = 4;
            Output_Spiral_Matrix(R,C,arr);

        }

        private static void Output_Spiral_Matrix(int m,int n,int[][] arr) {
            int i, k = 0, l = 0;
            while (k < m && l < n) {
                for (i = l; i < n; ++i) {
                    System.out.print(arr[k][i] + " ");
                }
                k++;
                for (i = k; i < m; ++i) {
                    System.out.print(arr[i][n - 1] + " ");
                }
                n--;

                if (k < m) {
                    for (i = n - 1; i >= l; --i) {
                        System.out.print(arr[m - 1][i] + " ");
                    }
                    m--;
                }
                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.print(arr[i][l] + " ");
                    }
                    l++;
                }
            }
        }
    }

## Program 13:
you are given a matrix of m x n elements (m rows, n columns), Print all elements of the matrix in spiral order in O(m*n) Time Complexity and O(1) Space Complexity 

Asked in: Microsoft, OLA, PayTm, Oracle
## Code:
    package com.company;

    public class Diagonal_Matrix {
        public static void main(String[] args) {
            int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            int m = arr.length;
            int n = arr[0].length;
            Matrix_Sum(arr,m,n);
        }

        private static void Matrix_Sum(int[][] arr,int m, int n) {
            for (int k = 0; k < m; k++) {
                int i = k;
                int j = 0;
                while (i>=0){
                        System.out.print(arr[i][j] + " ");
                        i = i-1;
                        j = j+1;
                }
                System.out.println();
            }
            for (int k = 1; k < n; k++) {
                int i = m-1;
                int j = k;
                while (j <= n-1){
                    System.out.print(arr[i][j] + " ");
                    i = i-1;
                    j = j+1;
                }
                System.out.println();
            }
        }
    }
# Day 14
## Program 14:
Array of length n having integers 1 to n with some elements being repeated. Count frequencies of all elements from 1 to n in Time Complexity O(n) and Space Complexity O(1) Asked in : PayTm, VmWare, Amazon
## Code:
    package com.company;

    public class Count_Frequency {
        public static void main(String[] args) {
            int[] arr = {5,2,2,3,4,5,1};
            int n = arr.length;
            Freq(arr,n);
        }

        private static void Freq(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                arr[i]--;
            }
            for (int i = 0; i < n; i++) {
                arr[arr[i] % n] = arr[arr[i] % n] + n;
            }
            for (int i = 0; i < n; i++) {
                System.out.println((i+1) + " " + arr[i]/n);
            }
        }
    }

## Program 15:
Given an array of integer, write an efficient algorithm to find majority number in that array in Time Complexity O(n) and Space Complexity O(1)
## Code:
    package com.company;

    public class Majority_Element {
        public static void main(String[] args) {
            int[] arr = {1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2};
            int ans = Find_Element(arr);
            System.out.println("Majority Element is: " + ans);
        }

        private static int Find_Element(int[] arr) {
            int majority = arr[0];
            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                if (majority == arr[j]){
                    count++;
                }
                else{
                    count--;
                }
                if (count == 0){
                    majority = arr[j];
                    count = 1;
                }
            }
            return majority;
        }
    }

## Program 16:
An array is given as Input where ith element is the price of a given stock on day You were permitted to complete unlimited transaction. Derive an algorithm to find the maximum profit in O(n) Time complexity and O(n) Space Complexity Asked in: Amazon, Microsoft, Flipkart, DE-Shaw
## Code:
    package com.company;

    public class Stock_Buy_Sell {
        public static void main(String[] args) {
            int[] price = { 98, 178, 250, 300, 40, 540, 690 };
            System.out.print("\nTotal profit earned is " + findMaxProfit(price));
        }
        // Function to find the maximum profit earned by buying and
        // selling shares any number of times
        public static int findMaxProfit(int[] price)
        {
            // keep track of the maximum profit gained
            int profit = 0;
            // initialize the local minimum to the first element's index
            int j = 0;
            // start from the second element
            for (int i = 1; i < price.length; i++)
            {
                // update the local minimum if a decreasing sequence is found
                if (price[i - 1] > price[i]) {
                    j = i;
                }
                // sell shares if the current element is the peak,
                // i.e., (`previous <= current > next`)
                if (price[i - 1] <= price[i] &&
                        (i + 1 == price.length || price[i] > price[i + 1]))
                {
                    profit += (price[i] - price[j]);
                    System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
                }
            }
            return profit;
        }
    }

## Program 17:
String is given as input that contains only lowercase letters, remove duplicate letters so that every letter appears once In O(n) Time Complexity and O(1) Space Complexity
## Code:
    package com.company;

    import java.util.Scanner;

    public class Remove_Duplicate_String_Letters {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the string with duplicate characters: ");
            String string = input.nextLine();
            String ans = Remove_Duplicate(string);
            System.out.println("After removing duplicate values: " + ans);

        }

        private static String Remove_Duplicate(String string) {
            int[] ascii = new int[256];
            char[] str1 = string.toCharArray();
            for (int i = 0; i < str1.length; i++) {
                if (ascii[str1[i]] == 0){
                    ascii[str1[i]] = -1;
                }
                else if (ascii[str1[i]] == -1){
                    str1[i] = '\0';
                }
            }
            String str2 = String.valueOf(str1);
            return str2.replaceAll("\0","");
        }
    }
# Day 15
## Program 18:
Matrix n*n is given, where all elements in any individual row or column are sorted. In such a matrix, we have to find the position of a value in O(n) Time Complexity and O(1) Space Complexity
## Code:
package com.company;

import java.util.Scanner;

public class Find_Element_Multidimensional_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }};
        int N = matrix.length;
        for (int[] ints : matrix) {
            for (int j = 0; j < N; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
        System.out.println("Enter the value you want to search in the array: ");
        int value = input.nextInt();
        Find_Element(matrix,N,value);
    }

    private static void Find_Element(int[][] matrix, int n, int value) {
        int i = 0;
        int j=n-1;
        while(i<n && j>=0){
            if(matrix[i][j] == value){
                System.out.println("Row: " + i + " " + "Column: " + j);
                return;
            }
            if(matrix[i][j] > value){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Value Not Found");
    }
}

## Program 19:
You are in a party of N people, where only one person is known to everyone. Such a person may be present at the party, if yes, (s)he doesn’t know anyone at the party. Your task is to find the celebrity at the party in Time Complexity O(n) Asked in: Google, Flipkart, Amazon, Microsoft
## Code:
package com.company;

public class Celebrity_Problem {
    public static void main(String[] args) {
        int n = 4;
        int result = findCelebrity(n);
        if (result == -1)
            {
                System.out.println("No Celebrity");
            }
        else
            System.out.println("Celebrity is " + result);
    }

    private static int findCelebrity(int n) {
        int a = 0;
        int b = n - 1;
        while (a < b)
        {
            if (knows(a, b))
                    a++;
            else
                b--;
        }

            for (int i = 0; i < n; i++)
                {
                    if (i != a && (knows(a, i) || !knows(i, a)))
                            return -1;
                }
            return a;
    }

    private static boolean knows(int a, int b) {
        int[][] matrix = {{ 0, 0, 1, 0 },
                       { 0, 0, 1, 0 },
                       { 0, 0, 0, 0 },
                       { 0, 0, 1, 0 }};
        boolean result = matrix[a][b] == 1;
        return result;
    }
}

## Program 20:
You are given a square matrix, You need to rotate the matrix in a clockwise direction by 90 degrees in Time Complexity O(m*n) and No Extra Space i.e O(1) Asked in : Facebook, Google, Amazon, Microsoft
## Code:
package com.company;

public class Rotate_Matrix_90_Degree {
    public static void main(String[] args) {
        int[][] matrix = {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }};
        int N = 4;
        Rotate_90_Degree(matrix,N);

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++)
                System.out.print( matrix[i][j] + " ");
            System.out.println();
        }
    }

    private static void Rotate_90_Degree(int[][] matrix,int N) {
        for (int i = 0; i < N/2; i++) {
            for (int j = i; j < N-i-1; j++) {
                int temp = matrix[i][N-1-j];
                matrix[j][N-1-j] = matrix[i][j];
                matrix[i][j] = matrix[N-1-j][i];
                matrix[N-1-j][i] = matrix[N-1-i][N-1-j];
                matrix[N-1-i][N-1-j] = temp;
            }
        }
    }
}
