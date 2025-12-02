import java.util.LinkedList;
import java.util.Queue;

public class BinaryNum {
    public static void binary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            System.out.print(s1+" ");
            q.remove();
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        binary(n);
    }
}
