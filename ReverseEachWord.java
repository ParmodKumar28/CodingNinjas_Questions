// Reverse Each Word
// Send Feedback
// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.
// Example:
// Input Sentence: "Hello, I am Aadil!"
// The expected output will print, ",olleH I ma !lidaA".
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
// Output Format:
// The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// emocleW ot gnidoC sajniN
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// syawlA tnedni ruoy edoc

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String Here Brother : ");
        String str = s.nextLine();
        String ans = reverseEachWord(str);
        System.out.println("Output : " + ans);
        s.close();

    }

    public static String reverseEachWord(String str)
    {
        String ans = "";
        int start = 0;
        int end = str.length();
        String ReversedWord = "";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);

            // Here fetching words and adding them to ans
            if (ch == ' ') {
                end = i;
                ReversedWord = "";
                for (int j = end-1; j >=start; j--) {
                    ReversedWord += str.charAt(j);
                }
                start = i+1;
                ans += ReversedWord + " ";
            }
        }

        // Adding first word to ans here
        ReversedWord = "";
        for (int i = str.length()-1; i >=start; i--) {
            ReversedWord += str.charAt(i);
        }
        ans += ReversedWord;

        return ans;
    }
}
