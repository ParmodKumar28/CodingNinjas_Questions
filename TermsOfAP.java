// Problem
// Result
// Terms of AP
// Send Feedback
// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
// Input format :
// Integer x
// Output format :
// Terms of series (separated by space)
// Constraints :
// 1 <= x <= 1,000
// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41
// Sample Input 2 :
// 4
// Sample Output 2 :
// 5 11 14 17

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        int i=1;
        while (count <= n) {
            int AP = 3 * i + 2;
            if (AP % 4 != 0) {
                System.out.print(AP + " ");
                count++;
            }
            i++;
        }
        s.close();
    }
}
