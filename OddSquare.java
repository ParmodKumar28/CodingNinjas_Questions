// Problem
// Result
// Odd Square
// Send Feedback
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = (2 * n) - 1;
        for (int row = 1; row <= n; row++) {
            int start_Value = 2 * row - 1;
            for (int col = 1; col <= n; col++) {
                if (start_Value > num) {
                    start_Value = 1;
                }
                System.out.print(start_Value);
                start_Value += 2;
            }
            System.out.println();
        }
        s.close();

    }
}
