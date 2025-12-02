import java.util.Queue;
import java.util.LinkedList;

public class InterleaveQueues {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        int size = q.size();
        
        for(int i=0; i<size/2; i++){
            temp.add(q.remove());
        }

        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=10; i++){
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty()) System.out.println(q.remove());
    }
}
