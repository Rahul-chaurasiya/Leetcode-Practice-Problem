class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[] = new int[nums.length];
        int counter = 0;
        int k = 0;

        for(int i: nums){
            if (i < pivot){
                arr[k++] = i;
            }else if(i == pivot){
                counter++;
            }
        }
        for(int i=0; i<counter; i++){
            arr[k++] = pivot;
        }
        for(int i: nums){
            if(i > pivot)arr[k++] = i;
        }
        
        return arr;
    }
}
