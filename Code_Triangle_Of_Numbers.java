// Code : Triangle of Numbers
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//          232
//        34543
//      4567654
//    567898765

import java.util.Scanner;

public class Code_Triangle_Of_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            int value1 = row;
            for (int num1 = 1; num1 <= row; num1++) {
                System.out.print(value1++);
            }
            int value2 = row;
            for (int num2 = 1; num2 <= row - 1; num2++) {
                System.out.print(value2--);
            }
            System.out.println();
        }
        s.close();
    }
}
