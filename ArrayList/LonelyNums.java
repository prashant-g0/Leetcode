import java.util.ArrayList;

public class LonelyNums {

    public static boolean isLonely(ArrayList<Integer> arr, int val){
        int count = 0;

        boolean leftVal = false;
        boolean rightVal = false;

        for(int ele : arr){
            if(ele == val) count++;
            if(ele == (val-1)) leftVal = true;
            if(ele == (val+1)) rightVal = true;
        }

        return count==1 && !leftVal && !rightVal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10); //arr.add(6); arr.add(5); arr.add(8);

        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<arr.size(); i++){
            if(isLonely(arr, arr.get(i))){
                res.add(arr.get(i));
            }
        }

        System.out.println(res);

    }
}
