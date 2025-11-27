import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            if(curr != ')'){
                stack.push(curr);
            } else {
                int count = 0;
                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                stack.pop();

                if(count<1) return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "(a+b)";
        System.out.println(isDuplicate(s1));
        String s2 = "((a+b))";
        System.out.println(isDuplicate(s2));
    }
}
