// Given an array arr[] consisting of both positive and negative integers, find the length of the longest subarray whose elements sum is zero.

// Examples:
// arr[] = [15, -2, 2, -8, 1, 7, 10]
// Output = 5
// [ -2, 2, -8, 1, 7 ]

// Code:

int maxLen(int arr[]){
  HashMap<Integer, Integer>mapp = new HashMap<Integer, Integer>();
  int maxi = 0;
  int sum = 0;
  int n = arr.length;

  for(int i=0; i<n; i++){
    sum += arr[i];
    if(sum ==0){
      maxi = i+1;
    } else{
      if(mapp.get(sum) != null){
        maxi = Math.max(maxi, i-mapp.get(sum));
      } else{
        mapp.put(sum, i);
      }
    }
  }
  return maxi;
}
