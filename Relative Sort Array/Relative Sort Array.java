class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[] = new int[1001];
        for(int x : arr1){
            arr[x]++;
        }

        int ans[] = new int[arr1.length];
        int k = 0;
        for(int i=0;i<arr2.length;i++){
            while(arr[arr2[i]]-->0){
                ans[k++] = arr2[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                while(arr[i]-->0){
                    ans[k++]=i;
                }
            }
        }

        return ans;
    }
}
