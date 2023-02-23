

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        
        // int low=0,high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                arr[0] = i;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
             if(nums[i] == target){
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}


===========================================================
    
    
// efficient solution
class Solution {
    public int[] searchRange(int[] arr, int x) {
        int a[] = {-1,-1};
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid]) low = mid + 1;
            else if (x < arr[mid]) high = mid - 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    a[0] = mid;
                    break;
                }
                else high = mid - 1;
            }
        }
        
        if(a[0]==-1) return a;
        int mid = a[0];
        while(true){
            if (mid == arr.length-1 || arr[mid + 1] != arr[mid]) {
                a[1] = mid;
                break;
            }
            else mid = mid + 1;
        }
        return a;
    }
}
