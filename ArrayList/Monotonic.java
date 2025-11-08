import java.util.ArrayList;



public class Monotonic {

    public static boolean checkDec(ArrayList<Integer> arr, int idx){
        int n = arr.size();

        for(int i=idx; i<n-1; i++){
            if(arr.get(i) < arr.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkInc(ArrayList<Integer> arr, int idx){
        int n = arr.size();

        for(int i=idx; i<n-1; i++){
            if(arr.get(i) > arr.get(i+1)){
                return false;
            }
        }
        return true;
    }

    // my method
    public static boolean checkMonotonic(ArrayList<Integer> arr){
        int n = arr.size();

        for(int i=0; i<n-1; i++){
            if(arr.get(i)<arr.get(i+1)){
                return checkInc(arr, i);
            }
            if(arr.get(i)>arr.get(i+1)){
                return checkDec(arr, i);
            }
        }
        return true;
    }

    // easier method
    public static boolean isMonotonic(ArrayList<Integer> arr){
        int n = arr.size();
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<n-1; i++){
            if(arr.get(i)>arr.get(i+1)){
                inc = false;
            }
            if(arr.get(i)<arr.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(1); arr.add(2); arr.add(0);

        // my ass brain
        System.out.println(checkMonotonic(arr));
        // some ass's brain
        System.out.println(isMonotonic(arr));

    }
}