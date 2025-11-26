import java.util.Stack;

public class ReverseString {

    public static String reverse(String s){
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            stk.push(s.charAt(i));
        }

        StringBuilder new_s = new StringBuilder("");
        while(!stk.isEmpty()){
            new_s.append(stk.pop());
        }
        return new_s.toString();
    }
    public static void main(String[] args) {
        String s = "HeLlo";
        System.out.println("Original: " + s);
        String new_s = reverse(s);
        System.out.println("Reversed: " + new_s);
    }
}
