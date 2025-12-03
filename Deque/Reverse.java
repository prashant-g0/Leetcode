import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

public class Reverse {
    public static void reverseK(Queue<Integer> q, int k){
        Deque<Integer> deque = new LinkedList<>();
        k = Math.min(k, q.size());

        for(int i=1; i<=k; i++){
            deque.addFirst(q.remove());
        }
        while(!q.isEmpty()) deque.addLast(q.remove());
        while(!deque.isEmpty()) q.add(deque.removeFirst());
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=10; i++) q.add(i*10);
        int k = 11;
        reverseK(q, k);
        while(!q.isEmpty()) System.out.print(q.remove()+" ");
    }
}
