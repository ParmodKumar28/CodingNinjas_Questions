// Code : Star Pattern
// Send Feedback
// Print the following pattern
// Pattern for N = 4

// Hint
// As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
// The dots represent spaces.

// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50

import java.util.Scanner;

public class Code_StarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
