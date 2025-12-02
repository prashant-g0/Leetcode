import java.util.PriorityQueue;

public class MinimumCostRope {
    public static int minimumCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr) pq.add(num);

        int totalCost = 0;
        while(pq.size()>1){
            int first = pq.remove();
            int second = pq.remove();
            int cost = first+second;
            totalCost += cost;
            pq.add(cost);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 6, 9};
        System.out.println(minimumCost(arr));
    }
}
