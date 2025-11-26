import java.util.Stack;
import java.util.ArrayList;

public class StocksSpan {

    public static ArrayList<Integer> calculateSpan(int[] prices){
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> span = new ArrayList<>();
        span.add(1);
        stk.push(0);

        for(int i=1; i<prices.length; i++){
            int currPrice = prices[i];
            while(!stk.isEmpty() && currPrice > prices[stk.peek()]){
                stk.pop();
            }

            if(stk.isEmpty()){
                span.add(i+1);
            } else {
                int prevHigh = stk.peek();
                span.add(i-prevHigh);
            }
            stk.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int prices [] = {100, 80, 60, 70, 60, 85, 100};
        System.out.print(calculateSpan(prices));
    }
}