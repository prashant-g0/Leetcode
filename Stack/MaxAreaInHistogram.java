import java.util.Stack;
import java.util.ArrayList;

public class MaxAreaInHistogram {

    public static void nxtSmallerRight(int[] height, ArrayList<Integer> nxt_smaller_right){
        Stack<Integer> stk = new Stack<>();
        for(int i=height.length-1; i>=0; i--){
            int curr = height[i];

            while(!stk.isEmpty() && height[stk.peek()] >= curr){
                stk.pop();
            }

            if(stk.isEmpty()) nxt_smaller_right.set(i, height.length);
            else nxt_smaller_right.set(i, stk.peek());

            stk.push(i);
        }
    }

    public static void nxtSmallerLeft(int[] height, ArrayList<Integer> nxt_smaller_left){
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<height.length; i++){
            int curr = height[i];

            while(!stk.isEmpty() && height[stk.peek()] >= curr){
                stk.pop();
            }

            if(stk.isEmpty()) nxt_smaller_left.set(i, -1);
            else nxt_smaller_left.set(i, stk.peek());

            stk.push(i);
        }
    }

    public static int maxAreaInHisto(int [] height){
        ArrayList<Integer> nxt_smaller_left = new ArrayList<>();
        ArrayList<Integer> nxt_smaller_right = new ArrayList<>();
        for(int i=0; i<height.length; i++){
            nxt_smaller_left.add(0);
            nxt_smaller_right.add(0);
        }

        nxtSmallerLeft(height, nxt_smaller_left);
        nxtSmallerRight(height, nxt_smaller_right);

        int maxArea = 0;
        for(int i=0; i<height.length; i++){
            int width = nxt_smaller_right.get(i) - nxt_smaller_left.get(i) -1;
            int area = height[i] * width;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {1,2,3,4,5};
        System.out.println(maxAreaInHisto(height));
    }
}
