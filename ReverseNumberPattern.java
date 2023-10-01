// Code : Reverse Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 21
// 321
// 4321
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            int num = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(num--);
            }
            System.out.println();
        }
        s.close();
    }
}
