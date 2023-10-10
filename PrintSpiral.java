// Print Spiral
// Send Feedback
// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
// a. First row(left to right)
// b. Last column(top to bottom)
// c. Last row(right to left)
// d. First column(bottom to top)
//  Mind that every element will be printed only once.
// Refer to the Image:
// Spiral path of a matrix

// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output format :
// For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// 0 <= M <= 10^3
// Time Limit: 1sec
// Sample Input 1:
// 1
// 4 4 
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16
// Sample Output 1:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
// Sample Input 2:
// 2
// 3 3 
// 1 2 3 
// 4 5 6 
// 7 8 9
// 3 1
// 10
// 20
// 30
// Sample Output 2:
// 1 2 3 6 9 8 7 4 5 
// 10 20 30 

import java.util.Scanner;

public class PrintSpiral {

    public static void takeInput(int arr[][], Scanner s) {
        System.out.println("Enter Elements of the array : ");
        int rows = arr.length;
        int columns = 0;
        if (rows != 0) {
            columns = arr[0].length;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter " + i + "th row " + j + "th column Element");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of test cases here : ");
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("Enter the rows of the " + i + " Array");
            int rows = s.nextInt();
            System.out.println("Enter the columns of the " + i + " Array");
            int columns = s.nextInt();
            int arr[][] = new int[rows][columns];
            takeInput(arr, s);
            spiralPrint(arr);
        }
    }

    public static void spiralPrint(int arr[][]) {
        int rows = arr.length;
        int columns = 0;
        if (rows != 0) {
            columns = arr[0].length;
        }

        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int col = left; col <= right; col++) {
                System.out.print(arr[top][col]+" ");
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                System.out.print(arr[row][right]+" ");
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(arr[bottom][col]+" ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(arr[row][left]+" ");
                }
                left++;
            }

        }

    }
}
