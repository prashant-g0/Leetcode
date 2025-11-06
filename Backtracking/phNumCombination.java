import java.util.*;

public class phNumCombination {

    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void combination(String digits, String ans, List<String> res){
        if(digits.length() == 0){
            res.add(ans);
            return;
        }

        String key = keypad[digits.charAt(0)-48];

        for(int i=0; i<key.length(); i++){
            combination(digits.substring(1), ans+key.charAt(i), res);
        }
        
    }
    public static void main(String[] args) {
        String digits = "23";
        List<String> res = new ArrayList<>();

        combination(digits, "", res);
        System.out.println(res);
    }
}
