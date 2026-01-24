// Problem Statement:
// You're given N pairs of numbers. 
// In every pair, the first number is always smaller than the 
// second number. A pair (c,d) can come after pair (a,b) if b<c.
// Find the longest chain which can be formet from a given set of pairs.

// Example:
// Input: pairs = (5, 24), (39, 60), (5, 28),  (27, 40), (50, 90)
// Output: ans = 3

import java.util.*;
public class ChainOFPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39, 60}, {5,28}, {27, 40}, {50, 90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chain_len = 1;
        int chain_end = pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chain_end){
                chain_len++;
                chain_end = pairs[i][1];
            }
        }

        System.out.println("Chain Length: "+chain_len);

    }
}
