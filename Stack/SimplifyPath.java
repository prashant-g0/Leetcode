import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path){
        Stack<String> stk = new Stack<>();
        
        String[] s = path.split("/");
        for(String word : s){
            if(word.equals("") || word.equals(".")) continue;
            if(word.equals("..") && !stk.isEmpty()) stk.pop();
            else stk.push(word);
        }

        StringBuilder str = new StringBuilder("");
        if(stk.isEmpty()) return str.append("/").toString();

        for(String p : stk){
            str.append("/").append(p);
        }
        
        return str.toString();
    }
    public static void main(String[] args) {
        String path = "//a/./b/../../c//";
        System.out.println(simplifyPath(path));
    }
}
