class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int mul = 1;
            for(int j=i;j<nums.length;j++){
                mul *= nums[j];
                if(mul < k) ans++;
                else break;
            }
        }
        return ans;
    }
}
