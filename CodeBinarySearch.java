// Code Binary Search
// Send Feedback
// You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.

// Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. Otherwise, return -1.

// Note: You must write an algorithm whose time complexity is O(logN).

// Example:

// Input: ‘N’ = 7 ‘target’ = 3
// ‘A’ = [1, 3, 7, 9, 11, 12, 45]

// Output: 1

// Explanation: For A = [1, 3, 7, 9, 11, 12, 45],
// The index of element '3' is 1.
// Hence, the answer is '1'.
// Input format :
// The first line contains an Integer 'N', which denotes the size of the array/list.

// The second line contains 'N' single space-separated integers representing the elements in the array/list.

// The third line contains the value of 'target' to be searched for in the array/list.
// Output Format :
// Return the index at which 'target' is present for each test case, -1 otherwise.
// Sample Input 1:
// 7
// 1 3 7 9 11 12 45
// 3
// Sample Output 1:
// 1
// Explanation of sample output 1:
// For nums = [1, 3, 7, 9, 11, 12, 45],
// The index of element '3' is 1.
// Hence, the answer is '1'.

// Sample Input 2:
// 7
// 1 2 3 4 5 6 7
// 9
// Sample Output 2:
// -1
// Explanation of sample output 2:
// For nums = [1, 2, 3, 4, 5, 6, 7],
// Element '9' doesn't exist.
// Hence, the answer is '-1'.

// Constraints :
// 1 <= N <= 10^4
// 1 <= A[i] <= 10^9
// 1 <= target <= 10^9
// Time Limit: 1 sec

import java.util.Scanner;

public class CodeBinarySearch {

    public static void takeInput(int arr[], int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Values Of The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length Of The Array : ");
        int N = s.nextInt();
        int arr[] = new int[N];
        takeInput(arr, N);
        System.out.println("Enter Target Value Here : ");
        int A = s.nextInt();
        int ans = binarySearch(arr, N, A);
        System.out.println(ans);
    }

    public static int binarySearch(int arr[], int N, int A) {
        int left = 0;
        int right = N - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == A) {
                return mid;
            } else if (arr[mid] < A) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return -1;
    }
}
