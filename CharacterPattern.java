// Code : Character Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// A
// BC
// CDE
// DEFG
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 13

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            int num = row;
            for (int col = 1; col <= row; col++) {
                System.out.print((char) (64 + num++));
            }
            System.out.println();
        }
        s.close();
    }
}
