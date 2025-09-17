// Problem:
// Uppercase the first letter of each word.

// Example:
// Input: "hi, i am prash"
// Output: "Hi, I Am Prash"

// Code:

class Main {
    public static String upperr(String sentance){
        int n = sentance.length();
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<n; i++){
            char ch = sentance.charAt(i);
            if(i == 0 || sentance.charAt(i-1)==' '){
                ch = Character.toUpperCase(ch);
            }
            res.append(ch);
        }
        return new String(res);
    }
    public static void main(String[] args) {
        String sentance = "hello WORLD! i am Coding";
        System.out.print(upperr(sentance));
    }
}

// Time Complexity: O(N)
