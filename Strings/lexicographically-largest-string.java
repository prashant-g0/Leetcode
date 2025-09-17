// Problem:
// You are given an array of strings. Write a program to find and return the lexicographically largest string (ignoring case).

// Example 1
// Input: ["apple", "axe", "ajant", "aze"]
// Output: "aze"

// Example 2
// Input: ["bat", "ball", "banana"]
// Output: "bat"

// Code:

class Main {
    public static String largest(String[] arr){
        String large = arr[0];
        for(int i=1; i<arr.length; i++){
            if(large.compareToIgnoreCase(arr[i]) < 0){
                large = arr[i];
            }            
        }
        return large;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "axe", "ajant", "aze"};
        System.out.print(largest(words));
    }
}
