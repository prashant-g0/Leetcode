public class mergeSort{
    public static void sort(String arr[], int st, int end){
        if(st>=end) return;

        int mid = st + (end-st)/2;
        sort(arr, st, mid);
        sort(arr, mid+1, end);

        merge(arr, st, mid, end);
    }

    public static void merge(String arr[], int st, int mid, int end){
        String temp[] = new String[end-st+1];
        int i = st, j=mid+1, k=0;

        while(i<=mid && j<=end){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k]=arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(k=0, i=st; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(String arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String arr[] = {"mother", "earth", "looking", "for", "life"};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
