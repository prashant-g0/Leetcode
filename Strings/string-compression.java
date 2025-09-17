// Problem:
// Given a string word, compress it such that consecutive duplicate characters are replaced by the character followed by the count of its occurrences. 
// If a character appears only once consecutively, keep it as is.

// Example 1
// Input: "aaabbbccc"
// Output: "a3b3c3"

// Example 2
// Input: "aabcccccaaa"
// Output: "a2bc5a3"

// Example 3
// Input: "abc"
// Output: "abc"

// Code:

class Main {
    public static String compress(String word){
        int n = word.length();
        StringBuilder res = new StringBuilder("");
        
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            Integer cnt = 1;
            while(i<n-1 && word.charAt(i+1)==ch){
                cnt++;
                i++;
            }
            res.append(ch);
            if(cnt>1){
                res.append(cnt.toString());
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        String word = "aaabbbcccdef";
        System.out.print(compress(word));
    }
}
