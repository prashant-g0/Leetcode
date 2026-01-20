
// Given the weights and values of N items, put these items in a knapsack
// of capacity W to get the maximum total value in the knapsack.

// Example:
// input: value = [60, 100, 120], weight = [10, 20, 30], w = 50
// output: res = 240

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {

        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        Double ratio[][] = new Double[value.length][2];

        for(int i=0; i<value.length; i++){
            ratio[i][0] = (double) i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, (a,b) -> Double.compare(b[1], a[1]));

        int capacity = w;
        int final_val = 0;
        for(int i=0; i<value.length; i++){
            int idx = ratio[i][0].intValue();
            if(capacity>weight[idx]){
                final_val += value[idx];
                capacity -= weight[idx];
            } else{
                final_val += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final val: " + final_val);
    }
}
