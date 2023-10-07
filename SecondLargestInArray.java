// Second Largest in array
// Send Feedback
// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
// Input format :
// The first line contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// Return the second largest element in the array/list.
// Constraints :
// 0 <= N <= 10^2
// 1<=arr[i]<=10^3

// Time Limit: 1 sec
// Sample Input 1:
// 5
// 4 3 10 9 2
// Sample Output 1:
// 9
// Sample Input 2:
// 7
// 13 6 31 14 29 44 3
// Sample Output 2:
// 31

import java.util.Scanner;

public class SecondLargestInArray {
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
        int ans = secondLargestElement(arr, N);
        System.out.println(ans);
    }

    public static int secondLargestElement(int arr[], int N) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
