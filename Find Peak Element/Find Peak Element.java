class Solution {
    public int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if((mid == 0 || arr[mid-1] < arr[mid]) && (mid == arr.length-1 || arr[mid+1] < arr[mid])) return mid;
            if(mid > 0 && arr[mid-1] > arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
