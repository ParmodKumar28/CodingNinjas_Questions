// Code : Triangular Star Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// *
// **
// ***
// ****
// Note : There are no spaces between the stars (*).
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50

import java.util.Scanner;

public class TriangularStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
