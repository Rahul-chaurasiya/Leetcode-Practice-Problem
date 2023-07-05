class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int count_zero = 0;
        int ans = 0;
        int end = 0;
        while(end < nums.length){
            if(nums[end] == 0) count_zero++;
            while(count_zero > 1){
                if(nums[start] == 0) count_zero--;
                start++;
            }
            ans = Math.max(ans,end-start);
            end++;
        }
        return ans;
    }
}
