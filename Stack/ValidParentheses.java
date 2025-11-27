import java.util.Stack;

public class ValidParentheses {
    
    public static boolean is_Valid(String s){
        Stack<Character> brac = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr=='(' || curr=='[' || curr=='{'){
                brac.push(curr);
            } else {
                if(brac.isEmpty()) return false;
                if((brac.peek() == '(' && curr == ')') ||
                    (brac.peek() == '[' && curr == ']') ||
                    (brac.peek() == '{' && curr == '}') ){
                        brac.pop();
                    } else return false;
            }
        }

        if(!brac.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "([{}][(]){})";
        System.out.println(is_Valid(s));
    }
}
