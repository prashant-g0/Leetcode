import java.util.ArrayList;

public class PairSumI {

    public static boolean pairSum(ArrayList<Integer> arr, int target){
        int n = 0, m = arr.size()-1;

        while(n<m){
            if(arr.get(n)+arr.get(m)==target){
                System.out.println(arr.get(n) + " " + arr.get(m));
                return true;
            } else if (arr.get(n)+arr.get(m)<target){
                n++;
            } else m--;
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);
        arr.add(4); arr.add(5); arr.add(6);

        int target = 9;
        System.out.println("Array: " + arr + "\nTarget: " + target);

        pairSum(arr, target);

    }
}
