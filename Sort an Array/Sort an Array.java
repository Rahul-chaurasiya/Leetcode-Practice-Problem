class Solution {
    public int[] sortArray(int[] arr) {
        sortarr(arr,0,arr.length-1);
        return arr;
    }

    public static void sortarr(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low) / 2 + low;
            sortarr(arr, low, middle);
            sortarr(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }


    public static void merge(int arr[], int l, int m, int h) {
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];   
    }
}
