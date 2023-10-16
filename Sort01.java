// Sort 0 1
// Send Feedback
// You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
// Note:
// You need to change in the given array/list itself. Hence, no need to return or print anything. 
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
// Output format :
// For each test case, print the sorted array/list elements in a row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 0 1 1 0 1 0 1
// Sample Output 1:
// 0 0 0 1 1 1 1
// Sample Input 2:
// 2
// 8
// 1 0 1 1 0 1 0 1
// 5
// 0 1 0 1 0
// Sample Output 2:
// 0 0 0 1 1 1 1 1
// 0 0 0 1 1 

import java.util.Scanner;

public class Sort01 {

    public static void printArray(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void takeInput(int arr[], int n,Scanner s) {
        
        System.out.println("Enter Values Of The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
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
            sortZeroesAndOne(arr, n);
            printArray(arr, n);
            System.out.println();
            s.close();
        }
    }

    public static void sortZeroesAndOne(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
    }
}
