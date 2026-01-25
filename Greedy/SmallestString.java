// Problem Statement:
// Given two integers N and K. 
// The task is to print the lexicographically smallest string of length N consisting of 
// lower-case English alphabets such that the sum of the characters of the string equals K 
// where 'a' = 1, 'b' = 2, 'c' = 3, ..... and 'z' = 26.

// Examples: 
// Input: N = 5, K = 42 
// Output: aaamz 
// "aaany", "babmx", "aablz" etc. are also valid strings 
// but "aaamz" is the lexicographically smallest.

// Input: N = 3, K = 25 
// Output: aaw 

import java.util.*;
public class SmallestString {
    public static void main(String[] args) {
        int n = 5, k = 42;

        char arr[] = new char[n];
        Arrays.fill(arr, 'a');

        for(int i=n-1; i>=0; i--){
            k-=i;

            if(k>=0){
                if(k>=26){
                    arr[i] = 'z';
                    k-=26;
                } else {
                    arr[i] = (char)(k+97-1);
                    k -= arr[i]-'a'+1;
                }
            } else break;
            k+=i;
        }

        System.out.print("Lexicographically smallest: "+new String(arr));
    }
}

// Another implementation:

// import java.util.*;
// public class SmallestString {
//     public static void main(String[] args) {
//         int n = 5, k = 42;

//         char[] arr = new char[n];
//         Arrays.fill(arr, 'a');

//         int remaining = k - n;  // since we already filled with 'a'

//         for (int i = n - 1; i >= 0 && remaining > 0; i--) {
//             int add = Math.min(25, remaining);  // max we can add to 'a'
//             arr[i] = (char) ('a' + add);
//             remaining -= add;
//         }

//         System.out.println("Lexicographically smallest: " + new String(arr));
//     }
// }

