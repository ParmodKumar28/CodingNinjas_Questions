// Return Array Sum
// Send Feedback
// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the sum of the numbers in the array/list.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5

// Time Limit: 1sec
// Sample Input 1:
// 1
// 3
// 9 8 9
// Sample Output 1:
// 26
// Sample Input 2:
// 2
// 5
// 1 2 3 4 5 
// 3
// 10 20 30 
// Sample Output 2:
// 15
// 60

import java.util.Scanner;

public class ReturnArraySum {
    public static void takeInput(int[] arr,Scanner s) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th index Element : ");
            arr[i] = s.nextInt();
        }
    }

    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of test cases bro: ");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + (i + 1) + " Array Length");
            int length = s.nextInt();
            int arr[] = new int[length];
            takeInput(arr,s);
            int sum = arraySum(arr);
            System.out.print(sum + " ");
            System.out.println();
            s.close();
        }

        s.close();
    }
}
