// Reverse String Wordwise
// Send Feedback
// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format :
// String in a single line
// Output format :
// Word wise reversed string in a single line
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always

import java.util.Scanner;

public class RevrseStringWordWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string here please : ");
        String str = s.nextLine();
        if (str == null) {
            str = "";
        }
        String ans = reverseWordWise(str);
        System.out.println(ans);
        s.close();
    }

    public static String reverseWordWise(String str) {
        String ans = "";
        int start = 0;
        int end = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // Here fetching words and adding them to ans
            if (ch == ' ') {
                start = i + 1;
                for (int j = start; j < end; j++) {
                    ans += str.charAt(j);
                }
                end = i;
                ans += ' ';
            }
        }

        // Adding first word to ans here
        for (int i = 0; i < end; i++) {
            ans += str.charAt(i);
        }

        return ans;
    }
}
