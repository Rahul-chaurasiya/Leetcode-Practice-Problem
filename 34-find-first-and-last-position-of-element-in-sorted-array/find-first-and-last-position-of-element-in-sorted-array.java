

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
