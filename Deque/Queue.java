import java.util.*;

public class Queue {
    static class QueueUsingDeque {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            if(deque.isEmpty()) return -1;
            return deque.removeFirst();
        }

        public int get(){
            if(deque.isEmpty()) return -1;
            return deque.getFirst();
        }

        public boolean isEmpty(){
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueUsingDeque q = new QueueUsingDeque();
        for(int i=0; i<5; i++) q.add(i);
        System.out.println(q.get());
        while(!q.isEmpty()) System.out.print(q.remove()+" ");
    }
}
