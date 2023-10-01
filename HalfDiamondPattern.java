// Problem
// Result
// Half Diamond Pattern
// Send Feedback
// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.

// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Sample Input 2 :
//  5
// Sample Output 2 :
// *
// *1*
// *121*
// *12321*
// *1234321*
// *123454321*
// *1234321*
// *12321*
// *121*
// *1*
// *
import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("*");
            System.out.println("*");
        }
        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                System.out.println("*");
            }
            int value = 0;
            for (int col = 1; col <= row * 2 - 1; col++) {
                if (col == 1) {
                    System.out.print("*");
                }

                if (col > row) {
                    value = value - 1;
                    System.out.print(value);
                } else {
                    value = value + 1;
                    System.out.print(value);
                }
                if (col == row * 2 - 1) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        // Second Part
        for (int row2 = n - 1; row2 >= 1; row2--) {
            int value2 = 0;
            for (int col2 = 1; col2 <= row2 * 2 - 1; col2++) {
                if (col2 == 1) {
                    System.out.print("*");
                }

                if (col2 > row2) {
                    value2 = value2 - 1;
                } else {
                    value2 = value2 + 1;
                }
                System.out.print(value2);
                if (col2 == row2 * 2 - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (row2 == 1) {
                System.out.print("*");
            }

        }
        s.close();
    }
}
