// Sum of Two Arrays
// Send Feedback
// Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
// You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
// Note:
// The sizes N and M can be different. 

// Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

// No need to print the elements of the output array/list.
// Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements of the first array/list.

// Third line contains an integer 'M' representing the size of the second array/list.

// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output Format :
// For each test case, print the required sum of the arrays/list in a row, separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// 0 <= M <= 10^5
// Time Limit: 1 sec 
// Sample Input 1:
// 1
// 3
// 6 2 4
// 3
// 7 5 6
// Sample Output 1:
// 1 3 8 0
// Sample Input 2:
// 2
// 3
// 8 5 2
// 2
// 1 3
// 4
// 9 7 6 1
// 3
// 4 5 9
// Sample Output 2:
// 0 8 6 5
// 1 0 2 2 0

import java.util.Scanner;

public class SumOfTwoArrays {

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
            System.out.print("Enter Length of " + i + " 1st Array : ");
            int n1 = s.nextInt();
            int arr1[] = new int[n1];
            takeInput(arr1, n1,s);
            System.out.println("Enter Length of " + i + " 2nd Array : ");
            int n2 = s.nextInt();
            int arr2[] = new int[n2];
            takeInput(arr2, n2,s);
            int output[] = new int[Math.max(n1, n2) + 1];
            sumOfTwoArrays(arr1, n1, arr2, n2, output);
            printArray(output, output.length);
            System.out.println();
            s.close();
        }
    }

    public static void sumOfTwoArrays(int arr1[], int n1, int arr2[], int n2, int output[]) {
        int i = n1 - 1;
        int j = n2 - 1;
        int k = output.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int num1 = (i >= 0) ? arr1[i] : 0;
            int num2 = (j >= 0) ? arr2[j] : 0;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            output[k] = sum % 10;
            i--;
            j--;
            k--;
        }
    }
}
