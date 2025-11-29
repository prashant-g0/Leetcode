import java.util.Stack;

public class DecodeString{
    public static String decoded(String coded){
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int num = 0;
        String res = "";

        for(int i=0; i<coded.length(); i++){
            char ch = coded.charAt(i);

            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else if(ch == '['){
                numStack.push(num);
                strStack.push(res);
                num = 0;
                res = "";
            }
            else if(ch == ']'){
                int k = numStack.pop();
                String prevStr = strStack.pop();
                prevStr += res.repeat(k);
                res = prevStr;
            }
            else{
                res += ch;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String coded = "3[a2[c]]";
        System.out.println(decoded(coded));
    }
}