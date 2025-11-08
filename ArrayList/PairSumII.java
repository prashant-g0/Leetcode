import java.util.ArrayList;

public class PairSumII {

    public static int findPivot(ArrayList<Integer> arr){
        int n = arr.size()-1;

        for(int i=0; i<n; i++){
            if(arr.get(i)>arr.get(i+1)){
                return i;
            }
        }
        return -1;
    }

    public static boolean findPair(ArrayList<Integer> arr, int target){
        int bp = findPivot(arr); // bp: breaking point

        int rp = bp; // rp: right pointer (largest value), 
        int lp = bp+1; // lp: left pointer (largest value)
        int n = arr.size();

        while(lp!=rp){
            if(arr.get(rp)+arr.get(lp)== target){
                System.out.println("Pair found...");
                System.out.println(arr.get(rp) + " + " + arr.get(lp+1) + " = " + target);
                return true;
            } else if(arr.get(rp)+arr.get(lp) < target){
                lp = (lp+1)%n;
            } else rp = (n+rp-1)%n;
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11); arr.add(15); arr.add(6);
        arr.add(8); arr.add(9); arr.add(10);

        int target = 10;

        if(!findPair(arr, target)){
            System.out.println("Pair not found...");
        }

    }
}

// time complexity: O(n)
