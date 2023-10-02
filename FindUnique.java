// Find Unique
// Send Feedback
// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
//  Note:
// Unique element is always present in the array/list according to the given condition.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the unique element present in the array.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 2 3 1 6 3 6 2
// Sample Output 1:
// 1
// Sample Input 2:
// 2
// 5
// 2 4 7 2 7
// 9
// 1 3 1 3 6 6 7 10 7
// Sample Output 2:
// 4
// 10

import java.util.Scanner;

public class FindUnique {

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
            int ans = findUnique(arr, n);
            System.out.println(ans);
            System.out.println();
        }
    }

    // public static int findUnique(int arr[], int n) {
    //     int unique = arr[0];
        
    //     for(int i=0;i<n;i++)
    //     {
    //         int count = 0;
    //         for(int j=0;j<n;j++)
    //         {
    //             if(arr[i]==arr[j])
    //             {
    //                 count++;
    //             }
    //         }
    //         if(count==1)
    //         {
    //             unique = arr[i];
    //         }
    //     }
    //     return unique;
    // }

    // Anathor Better Approach To Solve This
    public static int findUnique(int arr[],int n)
    {
        int unique =  0;
        for(int i=0;i<n;i++)
        {
            unique = unique^arr[i];
        }
        return unique;
    }
}
