// Check Permutation
// Send Feedback
// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
// Permutations of each other
// Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

// Example: 
// str1= "sinrtg" 
// str2 = "string"

// The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
// Input Format:
// The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

// The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
// Note:
// All the characters in the input strings would be in lower case.
// Output Format:
// The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

// You are not required to print anything. It has already been taken care of. Just implement the function. 
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// abcde
// baedc
// Sample Output 1:
// true
// Sample Input 2:
// abc
// cbd
// Sample Output 2:
// false

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st String Here Please : ");
        String str1 = s.nextLine();
        System.out.println();
        System.out.print("Enter 2nd String Here Please : ");
        String str2 = s.nextLine();
        boolean ans = isPermutation(str1, str2);
        System.out.println("Output : " + ans);
        s.close();
    }

    public static boolean isPermutation(String str1, String str2) {
        // One Way TC:- O(n logn), SC:- O(n)
        // char arr1[] = str1.toCharArray();
        // char arr2[] = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1,arr2);

        // Anathor way TC:- O(n), SC:- O(1)
        if(str1.length()!=str2.length())
        {
            return false;
        }

        int frequency[] = new int[256];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = 0;
        }


        for(int i=0;i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            frequency[ch]++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            frequency[ch]--;
        }

        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i]!=0)
            {
                return false;
            }
        }

        return true;
    }
}
