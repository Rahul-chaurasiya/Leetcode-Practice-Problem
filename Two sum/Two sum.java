class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int []ans = new int[2];

        int i = 0; 
        int j = i+1;

        while(i<j) {
           if(nums[i]+nums[j]==target){
               ans[0] = i;
               ans[1] = j;
               break;
           } 
           else if(j==n-1) {
               i++;
               j = i+1;
           } 
           else {
               j++;
           }
        }
        return ans;
    }
}


=============================================================================
  
  
//Efficient solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int c = 1; c < nums.length; c++){
            for(int i = 0; i + c < nums.length;i++){
                if(nums[i] + nums[i + c] == target){
                    return new int[] {i,i + c};
                }
            }
        }
        return new int[] {};
    }
}
