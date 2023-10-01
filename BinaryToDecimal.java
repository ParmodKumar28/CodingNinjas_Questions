// Problem
// Result
// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

import java.util.Scanner;

/**
 * BinaryToDecimal
 */
public class BinaryToDecimal {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int ans=0;
        int pow=0;
        while(N!=0)
        {
            int rem = N%10;
            ans+=Math.pow(2,pow)*rem;
            N=N/10;
            pow++;
        }
        System.out.println(ans);
        s.close();
    }
}