import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) s.push(q.remove());
        while(!s.isEmpty()) q.add(s.pop());
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=5; i>0; i--) q.add(i);
        reversal(q);
        while(!q.isEmpty()) System.out.print(q.remove() + " ");
    }
}
