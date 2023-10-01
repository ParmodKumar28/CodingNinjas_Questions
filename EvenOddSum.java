// Sum of even & odd
// Send Feedback
// Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.

// Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            n = n / 10;
        }
        System.out.println(evenSum + " " + oddSum);
        s.close();
    }
}
