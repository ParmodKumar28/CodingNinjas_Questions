// Array Intersection Send Feedback You have been given two integer arrays/list(ARR1 and ARR2)of size N and M,respectively.You need to print their intersection;An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words,when there is a common value that exists in both the arrays/lists.Note:Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in ascending order.

// Input format:The first line contains an Integer't'which denotes the number of test cases or queries to be run.Then the test cases follow.

// The first line of each test case or query contains an integer'N'representing the size of the first array/list.

// The second line contains'N'single space separated integers representing the elements of the first the array/list.

// The third line contains an integer'M'representing the size of the second array/list.

// The fourth line contains'M'single space separated integers representing the elements of the second array/list.Output format:For each test case,print the intersection elements in a row,separated by a single space.

// Output for every test case will be printed in a separate line.Constraints:1<=t<=10^2 0<=N<=10^4 0<=M<=10^4

// Time Limit:1 sec Sample Input 1:2 6 2 6 8 5 4 3 4 2 3 4 7 2 10 10 1 10 Sample Output 1:2 3 4 10 Sample Input 2:1 4 2 6 1 2 5 1 2 3 4 2 Sample Output 2:1 2 2 Explanation for Sample Output 2:Since,both input arrays have two'2's,the intersection of the arrays also have two'2's.The first'2'of first array matches with the first'2'of the second array.Similarly,the second'2'of the first array matches with the second'2'if the second array.

import java.util.Scanner;
import java.util.Arrays;

public class ArrayIntersection {
    public static void takeInput(int arr[], int n, Scanner s) {
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
            System.out.print("Enter Length of " + i + " 1st Array : ");
            int n1 = s.nextInt();
            int arr1[] = new int[n1];
            takeInput(arr1, n1, s);
            System.out.println("Enter Length of " + i + " 2nd Array : ");
            int n2 = s.nextInt();
            int arr2[] = new int[n2];
            takeInput(arr2, n2, s);
            intersection(arr1, n1, arr2, n2);
            System.out.println();
        }
        s.close();
    }

    public static void intersection(int arr1[], int n1, int arr2[], int n2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }

        }
    }

}
