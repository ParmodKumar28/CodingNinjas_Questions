// Code : Interesting Alphabets
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE
// Input format :
// N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            int num = 65 + n - row;
            for (int col = 1; col <= row; col++) {
                System.out.print((char) (num++));
            }
            System.out.println();
        }
        s.close();
    }
}
