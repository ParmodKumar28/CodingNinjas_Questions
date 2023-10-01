// Parallelogram Pattern
// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4

// The dots represent spaces.
// Input Format :
//  A single integer : N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***

import java.util.Scanner;

public class Parallelogram_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
