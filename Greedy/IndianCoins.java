// Problem Statement:
// We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000]
// Find min no. of coins/notes to make change for a value V.

// Example:
// Input: V = 121
// Output: ans = 3 (100+20+1)

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int count = 0;
        int amount = 2220;
        ArrayList<Integer> req_coins = new ArrayList<>();

        for (int i=coins.length-1; i>=0; i--){
                while(amount >= coins[i]){
                    count++;
                    req_coins.add(coins[i]);
                    amount -= coins[i];
                }
        }

        System.out.println("Minimum coins required: "+count);
        System.out.print("Required Coins: ");
        for(int i=0; i<req_coins.size(); i++){
            System.out.print(req_coins.get(i)+" ");
        }
        System.out.println();
    }
}
