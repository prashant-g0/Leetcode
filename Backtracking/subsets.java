// Given an array arr[] of distinct positive integers, your task is to find all its subsets.
// Note: You can return the subsets in any order, the driver code will print them in sorted order.

// Input: arr[] = [2, 4]
// Output: [[], [2], [2, 4], [4]]

// Code
import java.util.ArrayList;

class Solution {
    public static void subsetBuild(int i, int[] arr, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subset){
        
        if(i==arr.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(arr[i]);
        subsetBuild(i+1, arr, res, subset);
        subset.remove(subset.size()-1);
        subsetBuild(i+1, arr, res, subset);
        
    }
    
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        
        subsetBuild(0, arr, res, subset);
        
        return res;
    }
}
