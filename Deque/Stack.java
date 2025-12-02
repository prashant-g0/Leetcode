import java.util.*;

public class Stack {
    static class StackUsingDeque{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            if(deque.isEmpty()) return -1;
            return deque.removeLast();
        }

        public int peek(){
            if(deque.isEmpty()) return -1;
            return deque.getLast();
        }

        public boolean isEmpty(){
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        StackUsingDeque s = new StackUsingDeque();
        for(int i=4; i>0; i--) s.push(i);
        System.out.println(s.peek());
        while(!s.isEmpty()) System.out.println(s.pop());
    }
}
