import java.util.*;

public class UsingJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(12);
        deque.addLast(3);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

    }
}
