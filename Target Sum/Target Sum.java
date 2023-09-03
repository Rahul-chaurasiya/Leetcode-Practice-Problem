class Solution {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int target) {
        function(nums,0,0,target);
        return ans;
    }

    private void function(int []nums,int i,int sum,int target){
        if(i == nums.length){
            if(sum == target) ans++;
        }
        else{
            function(nums,i+1,sum+nums[i],target);
            function(nums,i+1,sum-nums[i],target);
        }
    }
}
