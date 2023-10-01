// Problem
// Result
// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.

// Pattern for N = 5

// The dots represent spaces.

// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *

import java.util.Scanner;

public class Code_Diamond_Of_Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = (n / 2) + 1;
        int n2 = (n / 2);
        // Upper Part
        for (int i1 = 1; i1 <= n1; i1++) {
            for (int space1 = 1; space1 <= n1 - i1; space1++) {
                System.out.print(" ");
            }
            for (int star1 = 1; star1 <= 2 * i1 - 1; star1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Down Part
        int value1 = 1;
        for (int i2 = n2; i2 >= 1; i2--) {
            for (int space2 = 1; space2 <= value1; space2++) {
                System.out.print(" ");
            }
            value1++;
            for (int star2 = 1; star2 <= i2; star2++) {
                System.out.print("*");
            }

            for (int starRight = 1; starRight <= i2 - 1; starRight++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
