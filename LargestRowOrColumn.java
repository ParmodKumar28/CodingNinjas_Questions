// Largest Row or Column
// Send Feedback
// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
// Note :
// If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output Format :
// For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
// OR
// If column sum is maximum, then print: "column" <col_index> <col_sum>
// It will be printed in a single line separated by a single space between each piece of information.

// Output for every test case will be printed in a seperate line.
//  Consider :
// If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
// Constraints :
// 1 <= t <= 10^2
// 1 <= N <= 10^3
// 1 <= M <= 10^3
// Time Limit: 1sec
// Sample Input 1:
// 1
// 3 2
// 6 9 
// 8 5 
// 9 2 
// Sample Output 1:
// column 0 23
// Sample Input 2:
// 1
// 4 4
// 6 9 8 5 
// 9 2 4 1 
// 8 3 9 3 
// 8 7 8 6 
// Sample Output 2:
// column 0 31

import java.util.Scanner;

public class LargestRowOrColumn {

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
            findLargest(arr);
        }
    }

    public static void findLargest(int arr[][]) {
        int rows = arr.length;
        int columns = 0;
        if (rows != 0) {

            columns = arr[0].length;
        }

        int largest = Integer.MIN_VALUE;
        int index = -1;
        String name = "";
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        int maxColSum = Integer.MIN_VALUE;
        int maxColIndex = 0;
        System.out.println("The Output : ");

        // Row Sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }

        // Column Sum
        for (int j = 0; j < columns; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }

        if (maxRowSum > maxColSum) {
            largest = maxRowSum;
            index = maxRowIndex;
            name = "row";
        } else if (maxRowSum == maxColSum) {
            largest = maxRowSum;
            index = maxRowIndex;
            name = "row";
        }
        else {
            largest = maxColSum;
            index = maxColIndex;
            name = "column";
        }

        System.out.println(name + " " + index + " " + largest);
    }
}
