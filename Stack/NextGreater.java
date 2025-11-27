import java.util.Stack;
import java.util.ArrayList;

public class NextGreater {

    public static ArrayList<Integer> nxtGtr(int[] arr) {
        Stack<Integer> prev = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            res.add(0);
        }

        for(int i=arr.length-1; i>=0; i--){
            
            while(!prev.isEmpty() && arr[prev.peek()]<=arr[i]){
                prev.pop();
            }

            if(prev.isEmpty()){
                res.set(i, -1);
            } else{
                res.set(i, arr[prev.peek()]);
            }

            prev.push(i);
        }

        return res;
    }

    public static void main(String[]args){
        int arr[] = {6, 8, 1, 0, 3};
        System.out.println(nxtGtr(arr));
    }
}
