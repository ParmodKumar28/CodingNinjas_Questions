// Problem
// Result
// Square Root (Integral)
// Send Feedback
// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.
// Input format :
// Integer N
// Output Format :
// Square root of N (integer part only)
// Constraints :
// 0 <= N <= 10^8
// Sample Input 1 :
// 10
// Sample Output 1 :
// 3
// Sample Input 2 :
// 4
// Sample Output 2 :
// 2

import java.util.Scanner;

public class SquareRoot {
    public static void Square_Root(int num) {
        int square = 0;
        int i = 0;
        int value = 0;
        while (value <= num) {
            value = 0;
            value = i * i;
            square = i;
            if (value >= num) {
                break;
            }
            i++;
        }

        if (value > num) {
            square = square - 1;
        }

        System.out.print(square + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please give total for how many sqaure root you want to know : ");
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Square_Root(arr[i]);
        }
        s.close();
    }

}
