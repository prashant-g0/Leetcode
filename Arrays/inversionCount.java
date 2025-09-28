class Solution {
    static int merge(int arr[], int st, int mid, int end){
        int i=st, j=mid+1, k=0;
        int temp[] = new int[end-st+1];
        int invCount = 0;
        
        while((i<=mid) && (j<=end)){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            } else{
                temp[k++]=arr[j++];
                invCount+=(mid-i+1);
            }
        }
        
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        
        for (i = st, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
        
        return invCount;
    }
    static int mergeSort(int arr[], int st, int end){
        int invCount = 0;
        if(st<end){
            int mid = st+(end-st)/2;
            invCount += mergeSort(arr, st, mid);
            invCount += mergeSort(arr, mid+1, end);
            invCount += merge(arr, st, mid, end);
        }
        return invCount;
    }
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length-1);
    }
}
