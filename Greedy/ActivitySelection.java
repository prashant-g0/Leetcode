
import java.util.ArrayList;

// Problem: 
// You're given N activities with their start and end time. Select the maximum number of activities that can be performed
// by a single person, assuming that a person can only work on a single activity at a time.
// Activities are sorted according to end time.

// Example:

// input: start = [10, 12, 20], end = [20, 25, 30]
// output: 2 (A0 & A2)

public class ActivitySelection{
    public static void main(String[] args) {
        int start[] = {10, 12, 20};
        int end[] = {20, 25, 30};

        int max_activity = 0;
        ArrayList<Integer> res = new ArrayList<>();

        max_activity = 1;
        res.add(0);
        int last_end = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= last_end){
                max_activity++;
                res.add(i);
                last_end = end[i];
            }
        }

        System.out.println("Max activities: " + max_activity);
        System.out.println("Activities: ");
        for(int i=0; i<res.size(); i++){
            System.out.print("A" + res.get(i)+" ");
        }
    }
}