public class MostFrequentFollowedbyKey {

    public static int mostFrequent(int[] nums, int key) {
        int [] res = new int[1000];

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==key) res[nums[i+1]-1]++;
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(res[i]>max){
                max = res[i];
                ans = i+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int key = 1;
        int[] nums = {1,100,2,1,100,1,20};

        System.out.println(mostFrequent(nums, key));
    }
}
