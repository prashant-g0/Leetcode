// Problem Statement:
// Given a balanced string str of size N with an equal number of L and R, 
// the task is to find a maximum number X, such that a given string can be partitioned 
// into X balanced substring. A string called to be balanced if the number of 'L's in the 
// string equals the number of 'R's. 

// Examples:
// Input : str = "LRLLRRLRRL" 
// Output : 4 
// Explanation: { "LR", "LLRR", "LR", "RL"} are the possible partitions.

// Input : "LRRRRLLRLLRL" 
// Output : 3 
// Explanation: {"LR", "RRRLLRLL", "RL"} are the possible partitions. 

public class BalancedPartitions {
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";
        int count_L = 0, count_R = 0;
        int partition = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'L'){
                count_L++;
            } else {
                count_R++;
            }

            if(count_L==count_R){
                partition++;
            }
        }

        System.out.println("Max Partitions: " + partition);
    }
}
