import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSubarray {
    public static int[] maxSub(int[] arr, int k){
        int[] res = new int[arr.length-k+1];
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<k; i++){
            while(!deque.isEmpty() && arr[i]>=arr[deque.getLast()]) deque.removeLast();
            deque.addLast(i);
        }
        int n = arr.length;
        int idx = 0;
        for(int i=k; i<n; i++){
            res[idx++] = arr[deque.getFirst()];
            while(!deque.isEmpty() && deque.getFirst()<(i-k+1)) deque.removeFirst();
            while(!deque.isEmpty() && arr[i]>=arr[deque.getLast()]) deque.removeLast();
            deque.addLast(i);
        }
        res[idx++] = arr[deque.getFirst()];

        return res;
    }
    public static void main(String[] args) {
        //int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int arr[] = {5, 1, 3, 4, 2};
        int k = 1;
        System.out.println(Arrays.toString(maxSub(arr, k)));
    }
}
