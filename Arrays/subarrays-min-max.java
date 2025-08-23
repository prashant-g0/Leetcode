import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            int st = i;
            for(int j=i; j<n; j++){
                int end = j;
                for(int k=st; k<=end; k++){
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print(" Sum: " + sum);
                if(min>sum){
                    min = sum;
                } else if(max<sum){
                    max = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min: "+min+"\nMax: "+max);
    }
}
