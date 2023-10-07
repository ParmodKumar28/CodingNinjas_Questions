// Sort 0 1 2
// Send Feedback
// You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
// 'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
// Note:
// You need to change in the given array/list itself. Hence, no need to return or print anything. 
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
// Output Format :
// For each test case, print the sorted array/list elements in a row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 0 1 2 0 2 0 1
// Sample Output 1:
// 0 0 0 1 1 2 2 
// Sample Input 2:
// 2
// 5
// 2 2 0 1 1
// 7
// 0 1 2 0 1 2 0
// Sample Output 2:
// 0 1 1 2 2 
// 0 0 0 1 1 2 2

import java.util.Scanner;

public class Sort012 {
    public static void printArray(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void takeInput(int arr[], int n) {
        Scanner s = new Scanner(System.in);
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
            takeInput(arr, n);
            sort(arr, n);
            printArray(arr, n);
            System.out.println();
        }
    }

    public static void sort(int arr[], int n) {
        int countZeroes = 0;
        int countOnes = 0;
        int countTwos = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                countZeroes++;
            }
            else if(arr[i]==1)
            {
                countOnes++;
            }
            else
            {
                countTwos++;
            }
        }
        
        int i = 0;
        while(countZeroes!=0)
        {
            arr[i]=0;
            i++;
            countZeroes--;
        }
        while(countOnes!=0)
        {
            arr[i]=1;
            i++;
            countOnes--;
        }
        while(countTwos!=0)
        {
            arr[i]=2;
            i++;
            countTwos--;
        }
    }
}
