class Solution {
    public long maximumTripletValue(int[] nums) {
        int l_arr[] = new int[nums.length];
        int r_arr[] = new int[nums.length];
        
        l_arr[0] = nums[0];
        for(int i=1;i<nums.length;i++) l_arr[i] = Math.max(l_arr[i-1],nums[i]);
        
        r_arr[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--) r_arr[i] = Math.max(r_arr[i+1],nums[i]);
        
        long ans = 0;
        for(int i=1;i<nums.length-1;i++){
            int lm = l_arr[i-1];
            int rm = r_arr[i+1];
            ans = Math.max(ans,(long) (lm - nums[i])*rm);
        }
        return ans;
    }
}
