// Swap Alternate
// Send Feedback
// You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
// You don't need to print or return anything, just change in the input array itself.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the elements of the resulting array in a single row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1sec
// Sample Input 1:
// 1
// 6
// 9 3 6 12 4 32
// Sample Output 1 :
// 3 9 12 6 32 4
// Sample Input 2:
// 2
// 9
// 9 3 6 12 4 32 5 11 19
// 4
// 1 2 3 4
// Sample Output 2 :
// 3 9 12 6 32 4 11 5 19 
// 2 1 4 3 

import java.util.Scanner;

public class SwapAlternate {

    public static void takeInput(int arr[], int n,Scanner s) {
        System.out.println("Enter Values Of The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
    }

    public static void printArray(int arr[], int N) {
        System.out.println("Output : ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number Of Test Cases : ");
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter Length of " + i + " Array : ");
            int n = s.nextInt();
            int arr[] = new int[n];
            takeInput(arr, n,s);
            swapAlternate(arr, n);
            printArray(arr,n);
            System.out.println();
            s.close();
        }
    }

    public static void swapAlternate(int arr[], int n) {
        int i = 0;
        while (i < n-1) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i=i+2;
        }
    }
}
