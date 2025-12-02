import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {

    public static String firstNonR(String str){
        Queue<Character> q = new LinkedList<>();
        StringBuilder new_s = new StringBuilder("");
        int[] freq = new int[26];

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            freq[curr - 97] += 1;
            q.add(curr);

            while(!q.isEmpty() && freq[q.peek() - 97] != 1){
                q.remove();
            }
            if(!q.isEmpty()) new_s.append(q.peek());
            else new_s.append("-1");
        }

        return new_s.toString();
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        System.out.println(firstNonR(s));
    }
}
