// Total Sum on the Boundaries and Diagonals
// Send Feedback
// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'N' column values separated by a single space.
// Output format:
// For each test case, print the single integer denoting the sum.

// Output for every test case will be printed in a seperate line.
// Constraints:
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// Time Limit: 1sec
// Sample input 1:
// 1
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1:
// 45
// Explanation for Sample Output 1:
// The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

// The first-diagonal elements are 1, 5 and 9. 

// The second-diagonal elements are 3, 5 and 7.

// We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

// Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
// Sample input 2:
// 2
// 5
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
// 4
// 1 2 3 10
// 4 5 6 11
// 7 8 9 12
// 13 14 15 16
// Sample Output 2:
// 273
// 136

import java.util.Scanner;

public class TotalSumOnBoundriesAndDiagonals {

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
            totalSum(arr);

        }
    }

    public static void totalSum(int arr[][]) {
        int rows = arr.length;
        int columns = 0;
        if (rows != 0) {

            columns = arr[0].length;
        }

        int totalSum = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(i==0||i==rows-1||j==0||j==columns-1||j==i||j==rows-i-1)
                {
                    totalSum += arr[i][j];
                }
            }
        }

        System.out.println("Output : " + totalSum);
    }

}
