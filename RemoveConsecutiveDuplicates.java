// Remove Consecutive Duplicates
// Send Feedback
// For a given string(str), remove all the consecutive duplicate characters.
// Example:
// Input String: "aaaa"
// Expected Output: "a"

// Input String: "aabbbcc"
// Expected Output: "abc"
//  Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// The only line of output prints the updated string.
// Note:
// You are not required to print anything. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// aabccbaa
// Sample Output 1:
// abcba
// Sample Input 2:
// xxyyzxx
// Sample Output 2:
// xyzx

import java.util.HashSet;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String Here Brother : ");
        String str = s.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println("Output : " + ans);

    }

    public static String removeConsecutiveDuplicates(String str)
    {
        if(str.length()==0)
        {
            return "";
        }

        String s = "";
        char same = str.charAt(0);
        s+=same;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=same)
            {
                s+=str.charAt(i);
                same = str.charAt(i);
            }
        }

        return s;
    }
}
