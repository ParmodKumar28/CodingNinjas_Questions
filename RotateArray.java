// Rotate array
// Send Feedback
// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
//  Note:
// Change in the input array/list itself. You don't need to return or print the elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains the value of 'D' by which the array/list needs to be rotated.
// Output Format :
// For each test case, print the rotated array/list in a row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^4
// 0 <= N <= 10^6
// 0 <= D <= N
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7
// 2
// Sample Output 1:
// 3 4 5 6 7 1 2
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7
// 0
// 4
// 1 2 3 4
// 2
// Sample Output 2:
// 1 2 3 4 5 6 7
// 3 4 1 2

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RotateArray {

    public static void takeInput(int arr[], int n, Scanner s) {
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
        System.out.println("Enter number of test cases: ");
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter Length Of " + i + "th test case 1st Array");
            int N = s.nextInt();
            int arr[] = new int[N];
            takeInput(arr, N, s);
            System.out.println("Enter the number for rotation : ");
            int D = s.nextInt();
            rotate(arr, N, D);
            printArray(arr, N);

        }
    }

    public static void rotate(int arr[], int N , int D)
    {
        

        Queue <Integer> q = new LinkedList<>();
        for(int i=D;i<N;i++)
        {
            q.add(arr[i]);
        }

        for(int i=0;i<D;i++)
        {
            q.add(arr[i]);
        }

        for(int i=0;i<N;i++)
        {
            arr[i] = q.remove();
        }

    }
}
